package be.collins.pojo;

<<<<<<< HEAD
import be.collins.exception.TournoiException;
=======
import java.util.*;

>>>>>>> refs/heads/POJO

public class Tournoi {

	//Variables
	ArrayList<Ordonnancement> listOrdonnancement;
	//Constructeurs 
	public Tournoi() 
	{
		listOrdonnancement = new ArrayList<Ordonnancement> ();
	}

	//Getters & Setters
	
	//Méthodes
<<<<<<< HEAD
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
=======
	/*
	 * 1 => simple messieur
	 * 2 => simple dames
	 * 3 => double messieur
	 * 4 => double dames
	 * 5 => double mixtes 
	 * */
	public void createTournoi()
	{
		/*for (int i = 1; i < 6; i++) 
		{
			listOrdonnancement.add(new Ordonnancement(i));
		}*/
		Ordonnancement o = new Ordonnancement(1);
		//System.out.println(o.getMatch().size());
	}
	
	public void TypeTournoi(int type){
		//System.out.println(o.getMatch().size());
		
		//return listOrdonnancement.get(type);
>>>>>>> refs/heads/POJO
	}
}
