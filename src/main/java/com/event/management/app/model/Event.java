package com.event.management.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Event {
     
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Id
	@Column(name = "eventId")
	
	private String eventId;
	@Column(name = "eventname")
	private String eventname;
	private String type; // New field added
	
	    @Lob
	    @Column(name = "image",columnDefinition = "LONGBLOB")
	    private byte[] image;
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(String eventId, String eventname,String type,byte[] image) {
		super();
		this.eventId = eventId;
		this.eventname = eventname;
		this.type = type;
		 this.image = image;
	}
	@Id
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventname() {
		return eventname;
	}
	 public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	 public String getType() {
			return type;
		}
	 public void setType(String type) {
			this.type = type;
		}
	   public byte[] getImage() {
	        return image;
	    }

	    public void setImage(byte[] image) {
	        this.image = image;
	    }
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventname=" + eventname + ",type=" + type + "]";
	}
	
	
	
	
}
