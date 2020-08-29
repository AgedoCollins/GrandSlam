package be.collins.pojo;

import java.util.*;

public class Ordonnancement {
	//variables
	private int nombreSetGagnant;
	private List<Match> match;
	private int typeOrdonnancement;
	
	//constructeur
	public Ordonnancement(int typeOrdonnancement) {
		if(typeOrdonnancement == 1) 
		{
			nombreSetGagnant = 3;
		}
		else 
		{
			nombreSetGagnant = 2;
		}
		System.out.println("Constructeur ordonnancement");
		this.typeOrdonnancement = typeOrdonnancement;
		this.generateOrdonnancement(this);
	}
	//getter & setter
	public int getNombreSetGagnant() {
		return nombreSetGagnant;
	}

	public void setNombreSetGagnant(int nombreSetGagnant) {
		this.nombreSetGagnant = nombreSetGagnant;
	}

	public List<Match> getMatch() {
		return match;
	}

	public void setMatch(List<Match> match) {
		this.match = match;
	}

	public int getTypeOrdonnancement() {
		return typeOrdonnancement;
	}

	public void setTypeOrdonnancement(int typeOrdonnancement) {
		this.typeOrdonnancement = typeOrdonnancement;
	}
	
	//methodes
	public void generateOrdonnancement(Ordonnancement o) {
		System.out.println("Début generate ordonnancement");
		Match m = new Match();
		System.out.println("Debut création match");
		o.match = m.creationMatch(o.typeOrdonnancement);
		System.out.println("fin création match"+o.getMatch().size());
		this.LancerOrdonnancement(o);
		System.out.println("Apres lancement ");
		ArrayList<Match> matchAJouer = new ArrayList<Match>();
		ArrayList<Match> matchDuDernierTour = new ArrayList<Match>(o.match);
		
		while(matchDuDernierTour.size() > 1) 
		{
			for(int i = 0; i < matchDuDernierTour.size();i=i+2) 
			{
				Equipe gagnant1 = matchDuDernierTour.get(i).getEquipeGagnante();
				Equipe gagnant2 = matchDuDernierTour.get(i+1).getEquipeGagnante();
				
				Match match = new Match();
				match = match.generateMatch(gagnant1, gagnant2);
				matchAJouer.add(match);
			}
			for(int i = 0; i < matchAJouer.size();i++) 
			{
				matchAJouer.get(i).lancerMatch(o.nombreSetGagnant, matchAJouer.get(i));
			} 
			o.match.addAll(matchAJouer);
			System.out.println("Match a jouer"+matchAJouer.size());
			matchDuDernierTour.clear();
			matchDuDernierTour.addAll(matchAJouer);
			matchAJouer.clear();
		}
		System.out.println("nombre de match finaux "+o.getMatch().size());
		
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

	public void LancerOrdonnancement(Ordonnancement o) {	
		for (int i = 0; i < o.match.size(); i++) {
			System.out.println("Match "+i);
			Match match = o.match.get(i);
			match.lancerMatch(o.nombreSetGagnant, match);
		}
	}

	
}
