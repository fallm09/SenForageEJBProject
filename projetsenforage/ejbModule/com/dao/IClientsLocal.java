package com.dao;

import java.util.List;

import javax.ejb.Local;

import com.entities.Clients;

@Local
public interface IClientsLocal {
	public List<Clients> liste();
	public int add (Clients clients);
		
	}

