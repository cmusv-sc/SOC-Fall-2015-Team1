package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Comment;
import models.User;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import util.APICall;
import util.APICall.ResponseType;
import views.html.climate.*;
import models.*;

public class CommentController extends Controller {
	final static Form<Comment> commentForm = Form.form(Comment.class);
	
	public static Result comment() {
        return ok(addComment.render(commentForm));
    }
	
	public static Result getComment() {
        return ok(getComment.render(commentForm));
    }
	
	
	
	public static Result getCommentByID() {
		Form<Comment> dc = commentForm.bindFromRequest();
		List<Comment> out_comments = new ArrayList<Comment>();

		try {
			String serviceID = dc.field("serviceID").value();
			if ((serviceID != null) && !serviceID.isEmpty()) {
                //System.out.println("22222");
				out_comments = Comment.findCommentsbyServiceID(serviceID);
            } else {
            	return redirect("/comment/getComment");
            }
			if (out_comments == null) {
                return redirect("/failLogin");
            }
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		return redirect("/home");
	}
	
	

	public static Result addComment(String commenter, String serviceID) {
		Form<Comment> dc = commentForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();

		try {

			jsonData.put("commenter", commenter);
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);
			Date date = new Date();
			String time = dateFormat.format(date);
			jsonData.put("time", time);
			jsonData.put("content", dc.field("Content").value());
			jsonData.put("serviceID", serviceID);
			String tagString = dc.field("hidden_tags").value();
			jsonData.put("tagList",tagString);
			
			
			JsonNode response = Comment.addComment(jsonData);
			Application.flashMsg(response);
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		return redirect("/newHome");
	}

}
