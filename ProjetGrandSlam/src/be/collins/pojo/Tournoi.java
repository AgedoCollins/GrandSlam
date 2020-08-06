package be.collins.pojo;

import java.util.ArrayList;
import java.util.List;

import be.collins.exception.TournoiException;

public class Tournoi {

	//Variables
	//Constructeurs 
	public Tournoi() 
	{
		
	}

	//Getters & Setters
	
	//Méthodes
	public void createTypeTournoi(int type,boolean genre)  throws TournoiException{
		boolean typeSimpleDouble = false;
		switch (type) {
		case 1: //simple homme
		case 2: //simple femme
			typeSimpleDouble = true;
			break;
		case 3://double dames
		case 4: //double hommes
			typeSimpleDouble = false;
			break;
		case 5 : 
			typeSimpleDouble = false; //5 mixte
			break;
		default:
			throw new TournoiException("Tournoi n'existe pas");
		}
		Ordonnancement o =new Ordonnancement(genre, typeSimpleDouble, type); //1 => 5
	}
}
