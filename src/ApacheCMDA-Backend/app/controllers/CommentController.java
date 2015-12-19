package controllers;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.ClimateService;
import models.ClimateServiceRepository;
import models.Comment;
import models.CommentRepository;
import models.Tag;
import models.TagRepository;

import play.mvc.Controller;
import play.mvc.Result;

@Named
@Singleton
public class CommentController extends Controller {

	private final ClimateServiceRepository climateServiceRepository;
	private final CommentRepository commentRepository;
    private final TagRepository tagRepository;
	@Inject
	public CommentController(final CommentRepository commentRepository, final ClimateServiceRepository climateServiceRepository, final TagRepository tagRepository) {
		this.climateServiceRepository = climateServiceRepository;
		this.commentRepository = commentRepository;
        this.tagRepository = tagRepository;
	}
	
	public Result addComment() {
		JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("Comment not saved, expecting Json data");
			return badRequest("Comment not saved, expecting Json data");
    	}
    	
    	String content = json.findPath("content").asText();
    	System.out.println("content" + content);
    	String commenter = json.findPath("commenter").asText();
    	System.out.println("commenter" + commenter);
    	String time = json.findPath("time").asText();
    	System.out.println("time" + time);
    	long serviceID = json.findPath("serviceID").asLong();
    	System.out.println("serviceID" + serviceID);
        String tagList = json.findPath("tagList").asText();
        System.out.println("tagList" + tagList);
        String[] newtaglist = tagList.split(",");

    	try {
    		
    		Comment newcomment = new Comment(content, commenter, time, serviceID, tagList);
    		System.out.println("comment created successfully");
    		
    		Comment savedCommentConfiguration = commentRepository.save(newcomment);
			System.out.println("Comment saved: "+ savedCommentConfiguration.getID());

            long newid = savedCommentConfiguration.getID();

            //save tags !!!
            for(String t : newtaglist) {
                Tag newtag = new Tag(t, newid);
                Tag savedTagConfiguration = tagRepository.save(newtag);
                System.out.println("Tag saved: "+ savedTagConfiguration.getID());
            }

			return created(new Gson().toJson(newcomment.getID()));
			
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Comment not created");
			return badRequest("Comment not created");
		}
	}
	
    public Result getComment(long id, String format) {
    	if (id < 0) {
    		System.out.println("id is negative!");
			return badRequest("id is negative!");
    	}
    	Comment comment = commentRepository.findOne(id);
    	if (comment == null) {
    		System.out.println("Comment not found with name: " + id);
			return notFound("Comment not found with name: " + id);
    	}
    	
    	String result = new String();
    	if (format.equals("json")) {
    		result = new Gson().toJson(comment);
    	}
    	
    	return ok(result);
    }
	
	
    public Result getAllComments(String format) {
    	try {
    		Iterable<Comment>comments =  commentRepository.findAll();
    		String result = new String();
    		result = new Gson().toJson(comments);
    		return ok(result);
    	} catch (Exception e) {
    		return badRequest("Comment not found");
    	}
    }
    
    //used to return all the comments of a specific serviceID!!!!!!
    public Result getCommentsByServiceID(String serviceID) {
    	if(serviceID == null) {
    		System.out.println("serviceID is null");
			return badRequest("serviceID is null");
    	}
    	System.out.println(Long.parseLong(serviceID));
       
    	// try {
    	List<Comment> comments =  commentRepository.findByServiceId(Long.parseLong(serviceID));

        //initial taglist of comments
        for(Comment c : comments) {
            List<Tag> tags =  tagRepository.findByCommentId(c.getID());
            String returntags = "";
            for(Tag t : tags) {
                returntags += t.getContent() + ",";
            }
            c.setTagList(returntags);
        }

        System.out.println("Finish finding comments");

    	int sum = 0;
    	for(Comment c : comments) {
    		sum++;
    	}
    	
    	System.out.println(sum);
    	if(comments == null) {
    		System.out.println("Comment not found with serviceID: " + serviceID);
			return notFound("Comment not found with serviceID: " + serviceID);
    	}
    	
    	String result = new String();
		result = new Gson().toJson(comments);
		System.out.println("hehedahaaha");
		return ok(result);
    	// } catch (Exception e) {
    	// 	return badRequest("Comments not found with this serviceid");
    	// }
    }
	
}
