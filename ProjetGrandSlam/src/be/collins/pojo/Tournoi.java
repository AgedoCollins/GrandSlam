package be.collins.pojo;

import java.util.*;


public class Tournoi {

	//Variables
	 ArrayList<Ordonnancement> listOrdonnancement;
	//Constructeurs 
	public Tournoi() 
	{
		listOrdonnancement=new ArrayList<Ordonnancement> ();
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
		listOrdonnancement.clear();
		for (int i = 1; i < 6; i++) 
		{
			listOrdonnancement.add(new Ordonnancement(i));
		}
		//Ordonnancement o = new Ordonnancement(1);
		//System.out.println(o.getMatch().size());
	}
	
	public void TypeTournoi(int type){
		//System.out.println(o.getMatch().size());
		
		Ordonnancement o =  listOrdonnancement.get(--type);
		
		for (int i = 0; i < o.getMatch().size(); i++) 
		{
			System.out.println("Match "+i);
			Match matchBis = o.getMatch().get(i);
			System.out.println("Court "+matchBis.getCourt().getIdCourt());
			System.out.println("Arbitre "+matchBis.getArbitre().getNom()+" "+matchBis.getArbitre().getPrenom());
			System.out.println("Equipe 1 "+ matchBis.getAdversaire()[0].getEquipe().get(0).getNom());
			System.out.println("Equipe 2 "+ matchBis.getAdversaire()[1].getEquipe().get(0).getNom());
			System.out.println("Gagnant : "+matchBis.getEquipeGagnante().getEquipe().get(0).getNom());
			int resultat[][] = matchBis.getResultat();
			for(int j = 0; j < resultat.length; j++) 
			{
				System.out.println("set "+(j+1)+" : "+resultat[j][0]+"-"+resultat[j][1]);
			}
			System.out.println("-------");
			System.out.println();
		}		 
	}
}
