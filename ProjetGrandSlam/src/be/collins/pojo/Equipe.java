package be.collins.pojo;

import java.util.*;

public class Equipe {
	// variable de classe
	public static List<Equipe> listeEquipe = null;

	// variables d'objet
	private List<Joueur> equipe;
	private int nbrVictoire;
	private boolean genre;

	// getter & setter
	public List<Joueur> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Joueur> equipe) {
		this.equipe = equipe;
	}

	public int getNbrVictoire() {
		return nbrVictoire;
	}

	public void setNbrVictoire(int nbrVictoire) {
		this.nbrVictoire = nbrVictoire;
	}

	public boolean getGenre() {
		return genre;
	}

	public void setGenre(boolean genre) {
		this.genre = genre;
	}

	// constructeur
	public Equipe() {
		nbrVictoire = 0;
		genre = false;
		equipe = new LinkedList<Joueur>();
		if (listeEquipe == null) {
			listeEquipe = new LinkedList<Equipe>();
			CreateEquipe(true, true); //simple homme
			CreateEquipe(true, false); //double hommes
			CreateEquipe(false, true); // simple femme
			CreateEquipe(false, false); // double femmes
			CreationEquipeMixte();
		}
	}

	// methodes
	private void CreateEquipe(boolean sexe, boolean type) {
		Random random = new Random();
		int tailleEquipe = 0;
		Joueur j = new Joueur();
		List<Joueur> listeJoueurs = j.joueurParGenre(sexe);
		if (type)
			tailleEquipe = 1;
		else
			tailleEquipe = 2;
		for (int i = 0; i < tailleEquipe; i++) {
			Equipe nouvelleEquipe = new Equipe();
			j = listeJoueurs.get(random.nextInt(listeJoueurs.size()));
			nouvelleEquipe.genre = sexe;
			nouvelleEquipe.equipe.add(j);
			listeJoueurs.remove(j);
			listeEquipe.add(nouvelleEquipe);
		}
	}

	private void CreationEquipeMixte() {
		// if gendre = true c homme sinon c femme
		Random random = new Random();
		Joueur j = new Joueur();
		List<Joueur> listeJoueurHomme = j.joueurParGenre(true);
		List<Joueur> listeJoueurFemme = j.joueurParGenre(false);
		for (int i = 0; i < 2; i++) {
			Equipe nouvelleEquipe = new Equipe();
			j = listeJoueurHomme.get(random.nextInt(listeJoueurHomme.size()));
			nouvelleEquipe.equipe.add(j);
			listeJoueurHomme.remove(j);
			j = listeJoueurFemme.get(random.nextInt(listeJoueurFemme.size()));
			nouvelleEquipe.equipe.add(j);
			listeJoueurFemme.remove(j);
			listeEquipe.add(nouvelleEquipe);
		}
	}

	public List<Equipe> selectionEquipe(boolean genre, boolean type, int nbrVictoire) {
		List<Equipe> Equipe = new LinkedList<Equipe>();
		int tailleEquipe = 0;
		if (type)
			tailleEquipe = 1;
		else
			tailleEquipe = 2;
		int compteur = 0;
		for (int i = 0; i < listeEquipe.size(); i++) {
			Equipe e = listeEquipe.get(i);
			if (e.genre == genre && e.equipe.size() < tailleEquipe && e.nbrVictoire == nbrVictoire) {
				Equipe.add(e);
				compteur++;
			}
		}
		return Equipe;
	}

	// override toString
	@Override
	public String toString() {
		return "Equipe [equipe=" + equipe + ", nbrVictoire=" + nbrVictoire + ", genre=" + genre + "]";
	}

}
