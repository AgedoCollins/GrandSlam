package be.collins.pojo;

import java.util.Date;

public class Arbitre extends Personne {
	// variables 
	private int idArbitre;

	// constructor
	public Arbitre(String nom, String prenom, boolean sexe, Date dateNaissance, int id) {
		super(nom, prenom, sexe, dateNaissance);
		idArbitre = id;
	}
	
	public Arbitre() {
		super();
	}

	// methods
}
