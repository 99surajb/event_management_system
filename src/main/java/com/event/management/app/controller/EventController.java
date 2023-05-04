package com.event.management.app.controller;

import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.event.management.app.dao.EventDAO;
import com.event.management.app.model.Event;

@RestController
@CrossOrigin
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	EventDAO eventDAO;
	
	@GetMapping(value = "/display" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Event> getAllEvents()
	{
		return eventDAO.getAllEvents();
	}
	
	/*
	 * @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	 * public void addEvent(@RequestBody Event event) { eventDAO.addEvent(event); }
	 */
	
	//image adding 
	
	/*
	 * @PostMapping(value = "/add", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	 * public void addEvent(@RequestBody Event event, @PathVariable("image")
	 * MultipartFile image) throws IOException { event.setImage(image.getBytes());
	 * eventDAO.addEvent(event); }
	 */
	@PostMapping(value = "/events", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> addEvent(@RequestParam("image") MultipartFile image, @RequestParam("eventname") String eventname, @RequestParam("type") String type,@RequestParam("eventId") String eventId) {
	    try {
	        Event event = new Event();
	        event.setEventId(eventId);
	        event.setEventname(eventname);
	        event.setType(type);
	        event.setImage(image.getBytes());
	        eventDAO.addEvent(event);
	        return new ResponseEntity<>(HttpStatus.CREATED);
	    } catch (IOException e) {
	        e.printStackTrace();
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	
	 @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public Event getEventById(@PathVariable("id") String id) {
	        return eventDAO.getEventById(id);
	    }
	 
	 
		/*
		 * @PutMapping(value = "/update/{id}", consumes =
		 * MediaType.APPLICATION_JSON_VALUE) public void updateEvent(@PathVariable("id")
		 * String id, @RequestBody Event updatedEvent) { Event event =
		 * eventDAO.getEventById(id); if (event == null) { // handle event not found
		 * error throw new RuntimeException("Event not found with id: " + id); }
		 * event.setEventname(updatedEvent.getEventname());
		 * event.setType(updatedEvent.getType()); // Set the new field value
		 * eventDAO.addEvent(event); }
		 */
	 
	 //adding image put
	 @PutMapping(value = "/update/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public void updateEvent(@PathVariable("id") String id, @RequestBody Event updatedEvent, @PathVariable("image") MultipartFile image) throws IOException {
			Event event = eventDAO.getEventById(id);
			if (event == null) {
				throw new RuntimeException("Event not found with id: " + id);
			}
			event.setEventname(updatedEvent.getEventname());
			event.setType(updatedEvent.getType());
			event.setImage(image.getBytes());
			eventDAO.updateEvent(event);
		}
	 
	 /*Change the "Content-Type" header to "multipart/form-data".
In the "Body" tab, select "form-data".
Add a new field with the key "image" and select the "File" option.
Select a file from your local machine and click "Send".*/
	 
	 @DeleteMapping(value = "/{id}")
	    public void deleteEventById(@PathVariable("id") String id) {
	        eventDAO.deleteEventById(id);
	    }

}
