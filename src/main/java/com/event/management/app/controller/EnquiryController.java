package com.event.management.app.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.management.app.dao.EnquiryDAO;
import com.event.management.app.model.Enquiry;

@RestController
@CrossOrigin
@RequestMapping("/enquiry")
public class EnquiryController {
	
	@Autowired
	EnquiryDAO enquiryDAO;
	
	@GetMapping(value = "/display" , produces = MediaType.APPLICATION_JSON_VALUE)//getting data of enquiries and display
	public Collection<Enquiry> getAllEnquiry()
	{
		return enquiryDAO.getAllEnquiry();
	}
	
	@PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveEnquiry(@RequestBody Enquiry enquiry)
	{
		enquiryDAO.saveEnquiry(enquiry);
	}
}
