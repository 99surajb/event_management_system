package com.event.management.app.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.event.management.app.model.Enquiry;

@Repository
public class EnquiryDAO {
	
	@PersistenceContext
	EntityManager entityManager;
//display enquiry
	public Collection<Enquiry> getAllEnquiry()
	{
		try 
		{
			return entityManager.createQuery("FROM Enquiry",Enquiry.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	//save enquiry
	@Transactional
	public void saveEnquiry(Enquiry enquiry)
	{
		try {
			entityManager.persist(enquiry);
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	
}
