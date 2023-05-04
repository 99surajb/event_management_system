package com.event.management.app.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.management.app.dao.ServicesDAO;
import com.event.management.app.model.Service;

@RestController
@CrossOrigin
@RequestMapping("/services")
public class ServiceController {

	@Autowired
	ServicesDAO servicesDAO;
	
	@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Service> getAllServices()
	{
		return servicesDAO.getAllServices();
	}	
	
}
