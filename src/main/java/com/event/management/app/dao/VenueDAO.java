package com.event.management.app.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.event.management.app.model.Venue;

@Repository
public class VenueDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Venue> getAllVenues()
	{
		try {
			return entityManager.createQuery("From Venue", Venue.class).getResultList();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
