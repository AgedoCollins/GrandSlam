package be.collins.pojo;

import java.util.*;

public class Ordonnancement {
	//variables
	private int nombreSetGagnant;
	private List<Match> match;
	private int typeOrdonnancement;
	private boolean genre;
	private boolean typeSimpleDouble;
	
	//constructeur
	public Ordonnancement(boolean genre, boolean typeSimpleDouble, int typeOrdonnancement) {
		nombreSetGagnant = genre? 3:2;
		this.typeSimpleDouble = typeSimpleDouble;
		this.genre = genre;
		this.typeOrdonnancement = typeOrdonnancement;
		this.generateOrdonnancement(this);
	}
	//getter & setter
	
	//methodes
	public void generateOrdonnancement(Ordonnancement o) {
		Match m = new Match();
		o.match = m.creationMatch(o.typeSimpleDouble, o.genre, o.nombreSetGagnant);
	}
	
	public void LancerOrdonnancement(Ordonnancement o) {
		for (Iterator<Match> iterator = match.iterator(); iterator.hasNext();) {
			Match match2 = (Match) iterator.next();
			match2.lancerMatch(o.nombreSetGagnant, match2);
		}		
	}

	
}
