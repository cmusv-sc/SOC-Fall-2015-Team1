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
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String content;
	// @ManyToOne(optional = false)
 //    @JoinColumn(name = "serviceId", referencedColumnName = "id")
	// private ClimateService climateService;
	private String commenter;
	private String time;
	private long serviceId;
	private String tagList;
	
	public Comment() {
		
	}
	
	public Comment(String content, String commenter, String time, long serviceId, String tagList ) {
		super();
		this.time = time;
		this.commenter = commenter;
		this.content = content;
		this.serviceId = serviceId;
		this.tagList = tagList;
	}
	
	public long getID() {
		return this.id;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String getCommenter() {
		return this.commenter;
	}
	
	public long getServiceID() {
		return this.serviceId;
	}
	
	public String getTagList() {
		return this.tagList;
	}
	// public ClimateService getClimateService() {
	// 	return climateService;
	// }
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	
	public void setSericeID(long serviceId) {
		this.serviceId = serviceId;
	}

	public void setTagList(String tagList) {
		this.tagList = tagList;

	}
	
	// public void setClimateService(ClimateService climateService) {
	// 	this.climateService = climateService;
	// }
	
	@Override
	public String toString() {
		String comment = "";
		comment = "Comment:\nID = " + this.id + ", serviceId = " + this.serviceId + 
				", Commenter = " + this.commenter + ", Time = " + this.time + "\nContent:    " + this.content;
		return comment;
	}
}
