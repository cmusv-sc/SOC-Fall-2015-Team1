package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.DataSet;
import models.User;
import models.Rating;
import models.metadata.ClimateService;
import play.data.Form;
import play.data.validation.Constraints;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.climate.dataSetList;
import java.util.*;

public class UserController extends Controller{
	final static Form<User> userForm = Form.form(User.class);
	final static Form<Rating> ratingForm = Form.form(Rating.class);

	public static Result addUser() {
		Form<User> dc = userForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		
		// userJsonData.put("userName", dc.field("userName").value());
		// userJsonData.put("password", dc.field("password").value());
		// userJsonData.put("firstName", dc.field("firstName").value());
		// userJsonData.put("lastName", dc.field("lastName").value());
		// userJsonData.put("middleInitial", dc.field("middleInitial").value());
		// userJsonData.put("affiliation", dc.field("affiliation").value());
		// userJsonData.put("title", dc.field("title").value());
		// userJsonData.put("email", dc.field("email").value());
		// userJsonData.put("mailingAddress", dc.field("mailingAddress").value());
		// userJsonData.put("phoneNumber", dc.field("phoneNumber").value());
		// userJsonData.put("faxNumber", dc.field("faxNumber").value());
		// userJsonData.put("researchFields", dc.field("researchFields").value());
		// userJsonData.put("highestDegree", dc.field("highestDegree").value());
		jsonData.put("userName", dc.field("UserName").value());
		jsonData.put("email", dc.field("Email").value());
		jsonData.put("firstName", dc.field("FirstName").value());
		jsonData.put("lastName", dc.field("LastName").value());
		jsonData.put("password", dc.field("Password").value());
		
		JsonNode response = ClimateService.addUser(jsonData);
		Application.flashMsg(response);
		
		return redirect("/climate/climateServices");
	}

	public static Result addRating(String url){
		Form<Rating> dc = ratingForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		jsonData.put("ratingNum", dc.field("ratingNum").value());
		// this is hard-code part
		jsonData.put("userName", "this is hard code username");
		jsonData.put("serviceName", url);

		// System.out.println("rating is "+dc.field("ratingNum").value());
		// System.out.println("url is "+url);
		JsonNode response = ClimateService.addRating(jsonData);
		// Application.flashMsg(response);
		return redirect("/climate/climateServices");
	}

	public static Result addRatingNew(String url,String serviceName,String serviceId,String email){
		Form<Rating> dc = ratingForm.bindFromRequest();
		// System.out.println("Enter the rating");
		String like = dc.field("inputLike").value();
		// System.out.println(like);
		// System.out.println(like);
		// System.out.println(like);



		System.out.println("store like "+like);

		JsonNode response1 = ClimateService.addLike(email, serviceId, like);
		ObjectNode jsonData = Json.newObject();
		jsonData.put("grade", dc.field("ratingNum").value());
		// this is hard-code part
		jsonData.put("email", email);
		jsonData.put("serviceId", serviceId);
		jsonData.put("serviceName", url);

		// System.out.println("email is "+ email);
		// System.out.println("rating is "+dc.field("ratingNum").value());
		// System.out.println("url is "+url);
		// System.out.println("service id is "+serviceId);
		// System.out.println("service name is "+serviceName);
		JsonNode response = ClimateService.addRating(jsonData);
		// Application.flashMsg(response);
		return redirect("/newHome");
	}

	public static Result mentionUsers(String url, String serviceName,
			String serviceId) {
		JsonNode response = ClimateService.getAllUser();
		List<User> users = new ArrayList<User>();
		String allUserNames = "";
		for (int i = 0; i < response.size(); i++) {
			JsonNode json = response.path(i);
			User newUser = new User();
			newUser.setUserName(json.path("userName").asText());
			newUser.setFirstName(json.path("firstName").asText());
			newUser.setLastName(json.path("lastName").asText());			
			users.add(newUser);
			allUserNames+="+"+json.path("firstName").asText()+" "+json.path("lastName").asText();
		}
		
		// return ok(allServices.get(0).getClimateServiceName());
		return ok(allUserNames);
	}

	public static Result mentionUsers2(String url, String serviceName,
			String serviceId) {
		JsonNode response = ClimateService.getAllUser();
		List<User> users = new ArrayList<User>();
		String allUserEmails = "";
		for (int i = 0; i < response.size(); i++) {
			JsonNode json = response.path(i);
			User newUser = new User();
			newUser.setEmail(json.path("email").asText());			
			users.add(newUser);
			allUserEmails+="+"+json.path("email").asText();
		}
		
		// return ok(allServices.get(0).getClimateServiceName());
		return ok(allUserEmails);
	}

}
