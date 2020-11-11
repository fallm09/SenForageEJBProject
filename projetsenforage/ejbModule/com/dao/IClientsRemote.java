package com.dao;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Clients;

@Remote
public interface IClientsRemote {
	public List<Clients> liste();
	public int add (Clients clients);

}
