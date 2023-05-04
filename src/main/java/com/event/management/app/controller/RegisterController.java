package com.event.management.app.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.event.management.app.dao.CustomerDAO;
import com.event.management.app.model.Customer;




@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	CustomerDAO customerDAO;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Customer> getAllCustomers(){
		
		return customerDAO.getAllCustomers();
		
	}
	
	@PostMapping(value="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveCustomer(@RequestBody Customer customer) {
		
		System.out.println(customer);
		customerDAO.saveCustomer(customer);
	}
}