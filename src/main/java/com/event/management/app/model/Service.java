package com.event.management.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="services")
public class Service {
	
	private String serviceId;
	private String serviceName;
	private int serviceCost;
	private String eventId;
	
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(String serviceId, String serviceName, int serviceCost, String eventId) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceCost = serviceCost;
		this.eventId = eventId;
	}
	@Id
	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(int serviceCost) {
		this.serviceCost = serviceCost;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", serviceName=" + serviceName + ", serviceCost=" + serviceCost
				+ ", eventId=" + eventId + "]";
	}
	
	

}
