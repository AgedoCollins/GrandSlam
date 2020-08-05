package be.collins.pojo;

import java.util.*;

public class Match {
	// Variables
	private Date date;
	private Date duree;
	private int[][] resultat;
	private Equipe[] adversaire;
	private Arbitre arbitre;
	private Court court;

	// constructeur
	public Match() {

	}

	// getter& setter
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDuree() {
		return duree;
	}

	public void setDuree(Date duree) {
		this.duree = duree;
	}

	public int[][] getResultat() {
		return resultat;
	}

	public void setResultat(int[][] resultat) {
		this.resultat = resultat;
	}

	public Equipe[] getAdversaire() {
		return adversaire;
	}

	public void setAdversaire(Equipe[] adversaire) {
		this.adversaire = adversaire;
	}

	public Arbitre getArbitre() {
		return arbitre;
	}

	public void setArbitre(Arbitre arbitre) {
		this.arbitre = arbitre;
	}

	public Court getCourt() {
		return court;
	}

	public void setCourt(Court court) {
		this.court = court;
	}

	//methodes
	public List<Match> creationMatch(boolean typeSimpleDouble, boolean genre, int nbrPourVictoire) {
		/*
		 * Pour la création, il faudra récupérer utiliser une d'équipe
		 */
		List<Match> list = new LinkedList<Match>();
		Equipe e = new Equipe();
		List<Equipe> listeEquipe = e.selectionEquipe(genre, typeSimpleDouble, nbrPourVictoire);
		return list;
	}

	/* debugging in progress */
	public void lancerMatch(int nbrSetGagnant, Match match) {
		int taille = nbrSetGagnant == 3 ? 5 : 3;
		int compteur = 0;
		int equipe01 = 0;
		int equipe02 = 0;
		int[] tableauSet = new int[2];
		int[][] tableauJeu = new int[taille][2];
		while (equipe01 != nbrSetGagnant && equipe02 != nbrSetGagnant) {
			tableauSet = genererSet(equipe01, equipe02, nbrSetGagnant);
			if (tableauSet[0] >= 6 && tableauSet[0] > tableauSet[1]) {
				equipe01++;
			} else {
				equipe02++;
			}
			tableauJeu[compteur][0] = tableauSet[0];
			tableauJeu[compteur][1] = tableauSet[1];
			compteur++;
		}
		int victoireEquipe = 0;
		/* for debugging */
		/*
		 * if(equipe01 == nbrSetGagnant) { victoireEquipe =
		 * match.adversaire[0].getNbrVictoire();
		 * match.adversaire[0].setNbrVictoire(++victoireEquipe); } else { victoireEquipe
		 * = match.adversaire[1].getNbrVictoire();
		 * match.adversaire[1].setNbrVictoire(++victoireEquipe); }
		 */
		match.resultat = tableauJeu;
	}

	public int[] genererSet(int setEquipe01, int setEquipe02, int nbrSetGagnant) {
		int setMax = nbrSetGagnant == 3 ? 2 : 1;
		boolean tieBreak;
		int[] tableau = new int[2];
		if (setEquipe01 == setMax && setEquipe02 == setMax) {
			tieBreak = false;
		} else {
			tieBreak = true;
		}
		if (tieBreak == false) {
			Random random = new Random();
			for (int i = 0; i < tableau.length; i++) {
				int rand = random.nextInt(7);
				tableau[i] = rand;
			}
			int difference01 = tableau[0] - tableau[1];
			int difference02 = tableau[1] - tableau[0];
			boolean winPoint;
			while (tableau[0] < 7 && tableau[1] < 7) {
				winPoint = random.nextBoolean();
				if (winPoint == true) {
					tableau[0]++;
				} else {
					tableau[1]++;
				}
			}
			while (tableau[0] >= 7 && difference01 < 2 || tableau[1] >= 7 && difference02 < 2) {
				winPoint = random.nextBoolean();
				if (winPoint == true) {
					tableau[0]++;
				} else {
					tableau[1]++;
				}
			}
		} else {
			Random random = new Random();
			while (tableau[0] == 7 && tableau[1] == 7) {
				for (int i = 0; i < tableau.length; i++) {
					int rand = random.nextInt(7);
					tableau[i] = rand;
				}
			}
			boolean winPoint;
			while (tableau[0] < 7 && tableau[1] < 7) {
				winPoint = random.nextBoolean();
				if (winPoint == true)
					tableau[0]++;
				else
					tableau[1]++;
			}
		}
		return tableau;
	}
}
