package com.event.management.app.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.event.management.app.model.Customer;




@Repository
public class CustomerDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Customer> getAllCustomers(){
		
		try {
			
			return entityManager.createQuery("From Customer", Customer.class).getResultList();
			
		} catch(Exception e) {
			
			throw new RuntimeException(e);
		}
	}
	
	@Transactional
	public void saveCustomer(Customer customer)
		{
		try {
			entityManager.persist(customer);
		}
		catch (Exception e) 
		{
			throw new RuntimeException(e);
		}
	}
	
}