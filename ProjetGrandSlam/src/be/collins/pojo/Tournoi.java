package be.collins.pojo;

import java.util.*;


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
	}
}
