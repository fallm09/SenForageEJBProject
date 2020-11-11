package com.dao;

import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Village;

@Stateless
public class VillageDao implements IVillageLocal{
	@PersistenceContext(unitName="projetsenforage_UP")
	private EntityManager em;
	@Override
	public List<Village> liste() {
		return em.createQuery("SELECT v FROM Village v")
				.getResultList();
	}

	@Override
	public int add(Village village) {
	int ok = 0;
	try {
		//em.getTransaction().begin();
		em.persist(village);
		//em.getTransaction().commit();
		ok=1;
	} catch (Exception e) {
		e.printStackTrace();
	}
			
		return ok;
	}

	@Override
	public Village getVillage(int village_id) {
		Village village =(Village) em.createQuery("SELECT v FROM Village v WHERE  v.id=:n").
				setParameter("n", village_id).getSingleResult();
		
		return village;
	}

}
