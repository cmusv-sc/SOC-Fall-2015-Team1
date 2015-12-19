/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;

import models.ClimateService;
import models.ClimateServiceRepository;
import models.ServiceEntry;
import models.ServiceEntryRepository;
import models.ServiceGrade;
import models.ServiceGradeRepository;
import models.ServiceLike;
import models.ServiceLikeRepository;
import models.User;
import models.UserRepository;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import ch.qos.logback.core.net.SyslogOutputStream;


@Named
@Singleton
public class ServiceLikeController extends Controller {

	class IsLikeResult{
		String response;
		
		public IsLikeResult(String result){
			this.response = result;
		}
	}
	
	private final ServiceLikeRepository serviceLikeRepository;
	private final ServiceEntryRepository serviceEntryRepository;
	private final ClimateServiceRepository climateServiceRepository;
	private final UserRepository userRepository;

	
	// We are using constructor injection to receive a repository to support our
	// desire for immutability.
	@Inject
	public ServiceLikeController(final ServiceLikeRepository serviceLikeRepository,
										final ServiceEntryRepository serviceEntryRepository,
											final ClimateServiceRepository climateServiceRepository,
											final UserRepository userRepository) {
		this.serviceLikeRepository = serviceLikeRepository;
		this.serviceEntryRepository = serviceEntryRepository;
		this.climateServiceRepository = climateServiceRepository;
		this.userRepository = userRepository;
	}
	
	

	public Result likeServices(String format){
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Expecting Json data");
			return badRequest("Expecting Json data");
		}
		
		String email = json.path("email").asText();
		long serviceID = json.path("serviceID").asLong();
		
		User user = userRepository.findByEmail(email);
		ClimateService service = climateServiceRepository.findById(serviceID);

		System.out.println("Like Services user_email = " + email);
		System.out.println("Like Services serviceID = " + serviceID);
		
		if ((user != null) && (service != null)){
	        String result = new String();
	        if (format.equals("json")) {
				ServiceLike serviceLike = new ServiceLike(service, user);
				serviceLikeRepository.save(serviceLike);
	        	
	            result = new Gson().toJson(serviceLike);
	        }

	        return ok(result);
		}else{
			return badRequest("Fail to 'like'");
		}
	}
	
	public Result isLike(String format){
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Cannot check islike, expecting Json data");
			return badRequest("Cannot check islike, expecting Json data");
		}
		
		String email = json.path("email").asText();
		long serviceID = json.path("serviceID").asLong();
		
		System.out.println("ISLIKE email: "  + email  + " serviceID: "+ serviceID);
		
		User user = userRepository.findByEmail(email);
		ClimateService service = climateServiceRepository.findById(serviceID);
		IsLikeResult returnResult = new IsLikeResult("false"); 
				
		if ((user != null) && (service != null)){
			ServiceLike sl = serviceLikeRepository.findByUserAndService(user, service);
				
			if (sl != null){
				returnResult.response = "true";
			}
		}
	
		System.out.println("ISLIKE Response: " + returnResult.response);
		
		return ok(new Gson().toJson(returnResult));
	}
	
	public Result getRecommendServices(String format){
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Expecting Json data");
			return badRequest("Expecting Json data");
		}
		
		String email = json.path("email").asText();
		
		System.out.println("GetRecommendServices, email = " + email);
		User user = userRepository.findByEmail(email);
		long userID = user.getId();
	
		System.out.println("Get Recommend Services user_id = " + userID);
		
		List<Long> recommendServiceID = serviceLikeRepository.getRecommandServiceID(userID);
		ArrayList<ClimateService> climateServices = new ArrayList<ClimateService>();
		
		System.out.println("Start finding RecommendID " + recommendServiceID.get(0));
		
		if (recommendServiceID != null){
			for (int i = 0; i < recommendServiceID.size(); i++){
				System.out.println("RecommendID: " + recommendServiceID.get(i));
				String tempID = recommendServiceID.get(i) + "";
				climateServices.add(climateServiceRepository.findById(Long.parseLong(tempID)));
			}
		}
		
        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(climateServices);
        }

        return ok(result);
	}
	

}
