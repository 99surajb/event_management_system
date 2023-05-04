package com.event.management.app.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.event.management.app.model.Event;
import com.event.management.app.model.Package;

@Repository
public class PackageDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Package> getE01Packages()
	{
		try 
		{
			return entityManager.createQuery("FROM Package WHERE eventId='E01'",Package.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		
	}
	public Collection<Package> getE02Packages()
	{
		try 
		{
			return entityManager.createQuery("FROM Package WHERE eventId='E02'",Package.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		
	}
	public Collection<Package> getE03Packages()
	{
		try 
		{
			return entityManager.createQuery("FROM Package WHERE eventId='E03'",Package.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		
	}
	public Collection<Package> getAllPackages()
	{
		try 
		{
			return entityManager.createQuery("FROM Package",Package.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		
	}
	
}
