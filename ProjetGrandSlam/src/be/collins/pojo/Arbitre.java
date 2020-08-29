package be.collins.pojo;

import java.util.*;

import be.collins.dao.AbstractDAOFactory;
import be.collins.dao.ArbitreDAO;

public class Arbitre extends Personne {
	// variables 
	private String anciennete;

	// constructor
	public Arbitre(String nom, String prenom, boolean sexe, Date dateNaissance, int id) {
		super(nom, prenom, sexe, dateNaissance);
	}
	
	public Arbitre() {
		super();
	}
	// getter & setter
	public String getAnciennete() {
		return anciennete;
	}

	public void setAnciennete(String anciennete) {
		this.anciennete = anciennete;
	}

	// methods
	public List<Arbitre> findAll() {
		// TODO Auto-generated method stub
		ArbitreDAO arbitreDAO = (ArbitreDAO) AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY).getArbitreDAO();
		List<Arbitre> list = arbitreDAO.findAll();
		return list;
	}
}
