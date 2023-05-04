package com.event.management.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="packages")
public class Package {

	private String packageId;
	private String packageName;
	private int packagePrice;
	private String eventId;
	
	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Package(String packageId, String packageName, int packagePrice, String eventId) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packagePrice = packagePrice;
		this.eventId = eventId;
	}

	@Id
	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public int getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(int packagePrice) {
		this.packagePrice = packagePrice;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", packageName=" + packageName + ", packagePrice=" + packagePrice
				+ ", eventId=" + eventId + "]";
	}
	
	
}