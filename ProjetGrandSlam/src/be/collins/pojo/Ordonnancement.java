package be.collins.pojo;

import java.util.*;

public class Ordonnancement {
	//variables
	private int nbrSetGagnant;
	private List<Match> match;
	private int typeOrdonnancement;
	private boolean genre;
	private boolean simple;
	
	//constructeur
	public Ordonnancement(boolean genre, boolean simple, int typeO) {
		nbrSetGagnant = genre? 3:2;
		this.simple = simple;
		this.genre = genre;
		this.recuperationDesMatch(this);
	}
	//getter & setter
	
	//methodes
	public void recuperationDesMatch(Ordonnancement o) {
		Match lien = new Match();
		o.match = lien.creationMatch(o.simple, o.genre, o.nbrSetGagnant);
	}
	
	public void generateOrdonnancement(Ordonnancement o) {
		for (Iterator<Match> iterator = match.iterator(); iterator.hasNext();) {
			Match match2 = (Match) iterator.next();
			match2.lancerMatch(o.nbrSetGagnant, match2);
		}		
	}

	
}
