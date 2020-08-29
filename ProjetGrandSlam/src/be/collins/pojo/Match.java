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
		adversaire = new Equipe[2];
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
	public List<Match> creationMatch( int type) {
		/*
		 * Pour la création, il faudra récupérer utiliser une d'équipe
		 */
		List<Match> list = new ArrayList<Match>();
		Equipe e = new Equipe();
		e.selectionEquipe(type);
		List<Equipe> listeEquipe = e.getListeEquipe();
		System.out.println("création list equipe"+listeEquipe.size());

		int cpt = listeEquipe.size()/2;
		for(int i = 0; i < cpt; i++) 
		{
			Random random = new Random();
			
			Equipe equipe1 = listeEquipe.get(random.nextInt(listeEquipe.size()));
			listeEquipe.remove(equipe1);
			Equipe equipe2 = listeEquipe.get(random.nextInt(listeEquipe.size()));
			listeEquipe.remove(equipe2);
			Match m = this.generateMatch(equipe1, equipe2);
		
			list.add(m);
		}
		System.out.println("création match list"+list.size());
		return list;
	}
	
	public Equipe getEquipeGagnante() 
	{
		if(adversaire[0].getNbrVictoire() > adversaire[1].getNbrVictoire()) 
		{
			return adversaire[0];
		}
		else 
		{
			return adversaire[1];
		}
	}
	public Match generateMatch(Equipe e1, Equipe e2) 
	{
		Arbitre arbitre = new Arbitre();
		List<Arbitre> listeArbitres = arbitre.findAll();
		Court court = new Court();
		List<Court> listeCourts = court.findAll();
		
		Match m = new Match();
		Random random = new Random();
		Arbitre a = listeArbitres.get(random.nextInt(listeArbitres.size()));
		m.setArbitre(a);
		Court c = listeCourts.get(random.nextInt(listeCourts.size()));
		m.setCourt(c);
		
		Equipe[] eTab = new Equipe[2];
		eTab[0] = e1;
		eTab[1] = e2;
		
		m.setAdversaire(eTab);
		
		return m;
	}
	public void lancerMatch(int nbrSetGagnant, Match match) {
		int taille = nbrSetGagnant == 3 ? 5 : 3;
		int compteur = 0;
		int equipe01 = 0;
		int equipe02 = 0;
		int[] tableauSet = new int[2];
		int[][] tableauJeu = new int[taille][2];
		while (equipe01 != nbrSetGagnant && equipe02 != nbrSetGagnant) {
			tableauSet = genererSet();
			if (tableauSet[0] > tableauSet[1]) {
				equipe01++;
			} else {
				equipe02++;
			}
			tableauJeu[compteur][0] = tableauSet[0];
			tableauJeu[compteur][1] = tableauSet[1];
			compteur++;
		}
		
		if(equipe01 == nbrSetGagnant) 
		{
			match.adversaire[0].setNbrVictoire(match.adversaire[0].getNbrVictoire()+1);
		}
		else 
		{
			match.adversaire[1].setNbrVictoire(match.adversaire[1].getNbrVictoire()+1);

		}
		match.resultat = tableauJeu;
	}

	public int[] genererSet() {
		
		int set[] = new int[2];
		set[0] = 0;
		set[1] = 0;
		// 6 - < 5, < 5-6, 7-5,  5-7, 7-6,6-7
		// set[0] == 6 && set[1] < 5, 
		//set[0] < 5 && set[1] == 6,
		//set[0] == 7 && set [1] ==5,
		//set[0] == 5&& set [1] ==7,
		//set[0] == 7 && set [1] ==6
		// set[0] == 6 && set [1] ==7
		
		
		while(!(( set[0] == 6 && set[1] < 5)||(set[0] < 5 && set[1] == 6)||(set[0] == 7 && set [1] ==5)||
				(set[0] == 5&& set [1] ==7)||(set[0] == 7 && set [1] ==6)||(set[0] == 6 && set [1] ==7))) 
		{
			if(Math.random() > 0.5)
			{
				set[0] = set[0]+1;
			}
			else 
			{
				set[1] = set[1]+1;
			}
		}
		
		return set;
	}
}
