package models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ServiceGradePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "user_id")
    private long userID;
    @Basic(optional = false)
    @Column(name = "service_id")
    private long serviceID;
    
    public ServiceGradePK(){
    }
    
    public ServiceGradePK(long userID, long serviceID){
    	this.userID = userID;
    	this.serviceID = serviceID;
    }
}
