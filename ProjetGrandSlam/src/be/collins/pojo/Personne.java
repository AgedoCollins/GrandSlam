package be.collins.pojo;

import java.util.Date;

public abstract class Personne {
	//Variables
	protected int id;
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected boolean sexe;
	
	//Constructeurs
	public Personne(int id, String nom, String prenom,Date dateNaissance,boolean sexe) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
	}
	public Personne(String nom, String prenom,boolean sexe,Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
	}
	public Personne() {

	}

	//Getters & Setters
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
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public boolean getSexe() {
		return sexe;
	}
	
	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}
	
	//Méthodes
}
