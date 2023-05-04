package com.event.management.app.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.event.management.app.model.Service;
@Repository
public class ServicesDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Service> getAllServices()
	{
		try 
		{
			return entityManager.createQuery("FROM Service",Service.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
