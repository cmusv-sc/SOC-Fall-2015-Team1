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
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import models.metadata.ClimateService;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import play.data.validation.Constraints;
import play.mvc.Result;
import util.APICall;
import util.Constants;
import views.html.climate.login;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String content;
	private String commenter;
	private String time;
	private String serviceID;
	private String tagList;
	
	
	private static final String ADD_COMMENT_SERVICE_CALL = Constants.NEW_BACKEND + "comment/addComment";
	private static final String GET_COMMENTS_SERVICE_CALL = Constants.NEW_BACKEND + "comment/getCommentByServiceID/";
	
	public Comment() {}
	
	public Comment(String content, String commenter, String time, String serviceID, String tagList) {
		super();
		this.time = time;
		this.commenter = commenter;
		this.content = content;
		this.serviceID = serviceID;
		this.tagList = tagList;
	}
	
	
	public long getID() {
		return this.id;
	}
	
	public String getContent() {
		return this.content;
	}
	
	
	public String getTime() {
		return this.time;
	}
	
	
	public String getCommenter() {
		return this.commenter;
	}
	
	public String getServiceID() {
		return this.serviceID;
	}
	
	public void setID(long id) {
		this.id = id;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	
	public void setSericeID(String serviceID) {
		this.serviceID = serviceID;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	
	//=========================================
	public String getTagList() {
		if (this.tagList==null||this.tagList.isEmpty()) {
			return "";
		}
		String[] tagArr = this.tagList.split(",");
		String tagList = "";
		for (int i=0;i<tagArr.length;i++) {
			tagList+=tagArr[i]+"  ";
		}
		return tagList;
	}

	public void setTagList(String tagList) {
		this.tagList = tagList;
	}
	
	
	@Override
	public String toString() {
		String comment = "";
		comment = "Comment:\nID = " + this.id + ", ServiceID = " + this.serviceID + 
				", Commenter = " + this.commenter + ", Time = " + this.time + "\nContent:    " + this.content;
		return comment;
	}
	
	public static JsonNode addComment(JsonNode jsonData) {
		return APICall.postAPI(ADD_COMMENT_SERVICE_CALL, jsonData);
	}
	
	
	
	
	
	
	public static List<Comment> findCommentsbyServiceID(String serviceID) {
		List<Comment> comments = new ArrayList<Comment>();
		JsonNode commentsNode = null;
		try {
			//long id = Long.parseLong(ser)
			commentsNode = APICall.callAPI(GET_COMMENTS_SERVICE_CALL + "serviceID/" + URLEncoder.encode(serviceID, "UTF-8"));	
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		if (commentsNode  == null || commentsNode.has("error")
				|| !commentsNode.isArray()) {
			System.out.println("Comment null");
			return null;
		}
		
		for (int i = 0; i < commentsNode.size(); i++) {
			
			JsonNode json = commentsNode.path(i);
			Comment comment = new Comment();
			comment.setTagList(json.path("tagList").asText());
			comment.setTime(json.path("time").asText());
			comment.setID(json.path("id").asLong());
			comment.setContent(json.path("content").asText());
			System.out.println(json.path("content").asText());
			comment.setCommenter(json.path("commenter").asText());
			comment.setSericeID(json.path("serviceID").asText());
			comments.add(comment);
		}
		return comments;
		
	}
	
 
}
