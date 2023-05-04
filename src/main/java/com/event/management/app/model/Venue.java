package com.event.management.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="venues")
public class Venue {

	private String venueId;
	private String venueName;
	private int venueCost;
	
	public Venue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venue(String venueId, String venueName, int venueCost) {
		super();
		this.venueId = venueId;
		this.venueName = venueName;
		this.venueCost = venueCost;
	}
	
	@Id
	public String getVenueId() {
		return venueId;
	}

	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public int getVenueCost() {
		return venueCost;
	}

	public void setVenueCost(int venueCost) {
		this.venueCost = venueCost;
	}

	@Override
	public String toString() {
		return "Venue [venueId=" + venueId + ", venueName=" + venueName + ", venueCost=" + venueCost + "]";
	}
	
	
}
