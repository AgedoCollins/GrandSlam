package be.collins.pojo;

import java.util.ArrayList;
import java.util.List;

public class Tournoi {

	//Variables
	//Constructeurs 
	public Tournoi() 
	{
		
	}

	//Getters & Setters
	
	//Méthodes
	public boolean createTypeTournoi(int type) {
		switch (type) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:	
			System.out.println("Tournoi inconnu");
			break;
		}
		return tournoisDAO.create(this);
	}
}
