package com.event.management.app.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.management.app.dao.PackageDAO;

@RestController
@CrossOrigin
@RequestMapping("/packages")
public class PackageController {

	@Autowired
	PackageDAO packageDAO;
	
	@GetMapping(value = "/wedding",produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<com.event.management.app.model.Package> getE01Packages()
	{
		return packageDAO.getE01Packages();
	}
	
	@GetMapping(value = "/Birthday",produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<com.event.management.app.model.Package> getE02Packages()
	{
		return packageDAO.getE02Packages();
	}
	
	@GetMapping(value = "/Corporate",produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<com.event.management.app.model.Package> getE03Packages()
	{
		return packageDAO.getE03Packages();
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<com.event.management.app.model.Package> getAllPackages()
	{
		return packageDAO.getAllPackages();
	}
	
	
	
	
}
