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
	public void createTypeTournoi(int type,boolean genre) {
		boolean typeSimpleDouble = false;
		switch (type) {
		case 1:
		case 2:
			typeSimpleDouble = true;
			break;
		case 3:
		case 4:
			typeSimpleDouble = false;
			break;
		default:
			break;
		} // 1-2 simple, 3-4 double
		Ordonnancement o =new Ordonnancement(genre, typeSimpleDouble, type); //1 => 5
	}
}
