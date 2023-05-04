package com.event.management.app.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.event.management.app.model.Enquiry;
import com.event.management.app.model.Event;

@Repository
public class EventDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Event> getAllEvents()
	{
		try 
		{
			return entityManager.createQuery("FROM Event",Event.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	@Transactional
	public Event addEvent(Event event) {
		
		 entityManager.persist(event);
		 
	    return event;
	}
	 public Event getEventById(String id) {
	        try {
	            return entityManager.createQuery("FROM Event WHERE eventId=:id", Event.class)
	                    .setParameter("id", id)
	                    .getSingleResult();
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
	 
	 
	  @Transactional
	    public void deleteEventById(String id) {
	        try {
	            Event event = entityManager.createQuery("FROM Event WHERE eventId=:id", Event.class)
	                    .setParameter("id", id).getSingleResult();
	            entityManager.remove(event);
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
	  
	 @Transactional
		public Event updateEvent(Event event) {
			try {
				Event updatedEvent = entityManager.find(Event.class, event.getEventId());
				if(updatedEvent != null) {
					updatedEvent.setEventname(event.getEventname());
					entityManager.merge(updatedEvent);
					return updatedEvent;
				}
				return null;
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
	 
}

