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
package models;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import play.data.validation.Constraints;
import util.APICall;
import util.Constants;

@Entity
public class Rating {
	private static final String GET_USER_CALL = Constants.NEW_BACKEND+"users/search/";

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String userName;
	@Constraints.Required
	private String password;
	@Constraints.Required
	private String firstName;
	@Constraints.Required
	private String lastName;
	private String middleInitial;
	private String affiliation;
	private String title;
	@Constraints.Required
	private String email;
	private String mailingAddress;
	private String phoneNumber;
	private String faxNumber;
	private String researchFields;
	private String highestDegree;
	private String serviceName;
	private int ratingNum;
	private String inputLike;
	// @OneToMany(mappedBy = "user", cascade={CascadeType.ALL})
	// private Set<ClimateService> climateServices = new
	// HashSet<ClimateService>();

	public Rating() {
	}

	public Rating(String userName, String password, String firstName,
			String lastName, String middleInitial, String affiliation,
			String title, String email, String mailingAddress,
			String phoneNumber, String faxNumber, String researchFields,
			String highestDegree,String serviceName,int ratingNum, String inputLike) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
		this.affiliation = affiliation;
		this.title = title;
		this.email = email;
		this.mailingAddress = mailingAddress;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.researchFields = researchFields;
		this.highestDegree = highestDegree;
		this.serviceName = serviceName;
		this.ratingNum = ratingNum;
		this.inputLike = inputLike;
	}

	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public String getTitle() {
		return title;
	}

	public String getEmail() {
		return email;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public String getResearchFields() {
		return researchFields;
	}

	public String getHighestDegree() {
		return highestDegree;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setResearchFields(String researchFields) {
		this.researchFields = researchFields;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}
	
	public String getLike() {
		return this.inputLike;
	}
	
	public void setLike(String inputLike) {
		this.inputLike = inputLike;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", middleInitial=" + middleInitial
				+ ", affiliation=" + affiliation + ", title=" + title
				+ ", email=" + email + ", mailingAddress=" + mailingAddress
				+ ", phoneNumber=" + phoneNumber + ", faxNumber=" + faxNumber
				+ ", researchFields=" + researchFields + ", highestDegree="
				+ highestDegree + "]";
	}

	public static boolean searchUser(String email, String pwd) {
		JsonNode jNode = search(email, pwd);
		String result = jNode.toString();
		System.out.println(result);
		System.out.println(result);
		if (result.equalsIgnoreCase("true")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static JsonNode search(String email, String pwd) {
		JsonNode jNode = null;
		try {
			jNode =  APICall.callAPI(GET_USER_CALL + "email/" + URLEncoder.encode(email, "UTF-8") + "/password/" + URLEncoder.encode(pwd, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return jNode;
	}

}

