package com.event.management.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Enquiry {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Id
	@Column(name = "Enqid")
	private int Enqid;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Email")
	private String Email;
	@Column(name = "Mobno")
	private int  Mobno;
	@Column(name = "Venue")
	private String Venue;
	@Column(name = "EventName")
	private String EventName;
	@Column(name = "Message")
	private String Message;
	
	
	
	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Enquiry(int enqid, String name, String email, int mobno, String venue, String eventName, String message) {
		super();
		Enqid = enqid;
		Name = name;
		Email = email;
		Mobno = mobno;
		Venue = venue;
		EventName = eventName;
		Message = message;
	}

	@Id
	public int getEnqid() {
		return Enqid;
	}
	public void setEnqid(int enqid) {
		Enqid = enqid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getMobno() {
		return Mobno;
	}
	public void setMobno(int mobno) {
		Mobno = mobno;
	}
	public String getVenue() {
		return Venue;
	}
	public void setVenue(String venue) {
		Venue = venue;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	@Override
	public String toString() {
		return "Enquiry [Enqid=" + Enqid + ", Name=" + Name + ", Email=" + Email + ", Mobno=" + Mobno + ", Venue="
				+ Venue + ", EventName=" + EventName + ", Message=" + Message + "]";
	}
	
	
	

	
	
}

