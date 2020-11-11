package com.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Village implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=150)
	private String nom ;
	@OneToMany(mappedBy="village", targetEntity=Clients.class, fetch = FetchType.LAZY)
    private List<Clients> clients;
	
	
	public Village(int id, String nom, List<Clients> clients) {
		super();
		this.id = id;
		this.nom = nom;
		this.clients = clients;
	}


	public List<Clients> getClients() {
		return clients;
	}
	
	
	public void setClients(List<Clients> clients) {
		this.clients = clients;
	}
	public Village() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	


}
