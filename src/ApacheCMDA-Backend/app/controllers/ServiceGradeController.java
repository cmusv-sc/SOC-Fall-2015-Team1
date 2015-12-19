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
import models.User;
import models.UserRepository;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;


@Named
@Singleton
public class ServiceGradeController extends Controller {

	private final ServiceGradeRepository serviceGradeRepository;
	private final ServiceEntryRepository serviceEntryRepository;
	private final ClimateServiceRepository climateServiceRepository;
	private final UserRepository userRepository;

	// We are using constructor injection to receive a repository to support our
	// desire for immutability.
	@Inject
	public ServiceGradeController(final ServiceGradeRepository serviceGradeRepository,
										final ServiceEntryRepository serviceEntryRepository,
											final ClimateServiceRepository climateServiceRepository,
											final UserRepository userRepository) {
		this.serviceGradeRepository = serviceGradeRepository;
		this.serviceEntryRepository = serviceEntryRepository;
		this.climateServiceRepository = climateServiceRepository;
		this.userRepository = userRepository;
	}
	
	public Result addGrade() {
		
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Service is not rated, expecting Json data");
			return badRequest("Service is not rated, expecting Json data");
		}
		
//		String serviceName = json.path("serviceName").asText();
//		String versionNo = json.path("versionNo").asText();
		long id = json.path("serviceId").asLong();
//		String userName = json.path("userName").asText();
		int grade = json.path("grade").asInt();
		String email = json.path("email").asText();
		
		System.out.println("ADD SERVICE SCODE id = " + id + " email = " + email + "Grade = " + grade);
		
//		User user = userRepository.findFirstByUserName(userName);
		User user = userRepository.findByEmail(email);
		ClimateService service = climateServiceRepository.findById(id);
		
//		ClimateService service = climateServiceRepository.getEntryByNameAndVersionNo(serviceName, versionNo).get(0);
		if ((user != null) && (service != null)){
			service.setAvgScore((service.getAvgScore() * service.getVoteCount() + grade) * 1.0 / (service.getVoteCount() + 1));
			service.setVoteCount(service.getVoteCount() + 1);
			
			ServiceGrade serviceGrade = new ServiceGrade(service, user, grade);
			serviceGradeRepository.save(serviceGrade);
			climateServiceRepository.setAvgScoreAndVoteCountForId(service.getAvgScore(), service.getVoteCount(), service.getId());
			return ok("Rated succcessfully");
		}else{
			
			if (user == null){
				System.out.println("User is NULL");
			}else if (service == null){
				System.out.println("Service is NULL");
			}
			
			return badRequest("Fail to rate");
		}
	}
}
