package controllers;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

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
public class TagController extends Controller {

	private final TagRepository tagRepository;
	private final CommentRepository commentRepository;
	
	@Inject
	public TagController(final CommentRepository commentRepository, final TagRepository tagRepository) {
		this.tagRepository = tagRepository;
		this.commentRepository = commentRepository;
	}
	
	public Result addTag() {
		JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("Tag not saved, expecting Json data");
			return badRequest("Tag not saved, expecting Json data");
    	}
    	
    	String content = json.findPath("content").asText();
    	System.out.println("content" + content);
    	
    	long commentId = json.findPath("commentId").asLong();
    	System.out.println("commentId" + commentId);
    	
    	try {
    		Tag newtag = new Tag(content, commentId);
    		System.out.println("tag created successfully");
    		
    		Tag savedTagConfiguration = tagRepository.save(newtag);
			System.out.println("Tag saved: "+ savedTagConfiguration.getID());
			return created(new Gson().toJson(newtag.getID()));
			
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Tag not created");
			return badRequest("Tag not created");
		}
	}
	
    //used to return all the tags of a specific commentId!!!!!!
    public Result getTagsByCommentId(String commentId) {
    	if(commentId == null) {
    		System.out.println("commentId is null");
			return badRequest("commentId is null");
    	}
    	System.out.println(Long.parseLong(commentId));
        
    	// try {
    	List<Tag> tags =  tagRepository.findByCommentId(Long.parseLong(commentId));

    	if(tags == null) {
    		System.out.println("Tag not found with commentId: " + commentId);
			return notFound("Tag not found with commentId: " + commentId);
    	}
    	
        System.out.println("Finish finding tags");

    	int sum = 0;
    	for(Tag c : tags) {
    		sum++;
    	}
    	
    	System.out.println(sum);
    	
    	String result = new String();
		result = new Gson().toJson(tags);
		System.out.println("hehedahaaha");
		return ok(result);
    }
	
}
