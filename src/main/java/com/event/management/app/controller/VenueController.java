package com.event.management.app.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.management.app.dao.VenueDAO;
import com.event.management.app.model.Venue;

@RestController
@CrossOrigin
@RequestMapping("/venues")
public class VenueController {

	@Autowired
	VenueDAO venueDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Venue> getAllVenues(){
		return venueDAO.getAllVenues();
	}
	
}
