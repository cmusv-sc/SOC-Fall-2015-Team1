package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String content;
	private long commentId;

	public Tag() {
		
	}
	
	public Tag(String content, long commentId) {
		super();
		this.content = content;
		this.commentId = commentId;
	}
	
	public long getID() {
		return this.id;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public long getCommentId() {
		return commentId;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	
	@Override
	public String toString() {
		String tag = "";
		tag = "Tag:\nID = " + this.id + 
				", CommentId = " + this.commentId + "\nContent: " + this.content;
		return tag;
	}
}
