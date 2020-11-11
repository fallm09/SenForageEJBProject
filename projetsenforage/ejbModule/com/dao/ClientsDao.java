package com.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Clients;

@Stateless
public class ClientsDao  implements IClientsLocal{
	@PersistenceContext(unitName="projetsenforage_UP")
	private EntityManager em;
	
	@Override
	public List<Clients> liste() {
		
		
		
		return em.createQuery("SELECT c FROM Clients c")
				.getResultList();
	
	}

	@Override
	public int add(Clients clients) {
		int ok = 0;
		try {
		//em.getTransaction().begin();
		  em.persist(clients);
		//em.getTransaction().commit();
		ok = 1;
	} catch (Exception e) {
		e.printStackTrace();
	}
			
		return ok;
	}
	
	 
}
