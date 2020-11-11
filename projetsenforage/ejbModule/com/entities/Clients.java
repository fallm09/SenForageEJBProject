package com.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Clients implements Serializable{
	@Id
	@Column( nullable =false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=75)
	private String nom ;
	@Column(length=75)
	private String prenom ;
	@Column(length=100)
	private String adresse;
	@Column(length=75)
	private String numero ;
	

	
	 public Clients(int id, String nom, String prenom, String adresse, String numero, Village village) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numero = numero;
		this.village = village;
	}

	@ManyToOne
	    @JoinColumn(name="village_id")
	    private Village village;
	public Clients() {
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Village getVillage() {
		return this.village;
	}

	public void setVillage(	Village village) {
		this.village = village;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	
	
	
	
	
	
	
	

}
