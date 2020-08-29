package be.collins.pojo;

import java.util.*;

public class Equipe {

	public  List<Equipe> listeEquipe = new ArrayList<Equipe>();
	// variables d'objet
	private List<Joueur> equipe;
	private int nbrVictoire;

	// getter & setter
	public List<Joueur> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Joueur> equipe) {
		this.equipe = equipe;
	}
	
	public List<Equipe> getListeEquipe() {
		return listeEquipe;
	}

	public void setListeEquipe(List<Equipe> listeEquipe) {
		this.listeEquipe = listeEquipe;
	}

	public int getNbrVictoire() {
		return nbrVictoire;
	}

	public void setNbrVictoire(int nbrVictoire) {
		this.nbrVictoire = nbrVictoire;
	}


	// constructeur
	public Equipe() {
		nbrVictoire = 0;
		equipe = new LinkedList<Joueur>();
		listeEquipe = new LinkedList<Equipe>();
	}

	// methodes
	private void CreateEquipe(boolean sexe, boolean type) {
		Random random = new Random();
		Joueur j = new Joueur();
		List<Joueur> listeJoueurs = j.joueurParGenre(sexe);
		System.out.println("joueur par genre "+listeJoueurs.size());
		if (type) {
			int taille  = listeJoueurs.size();
			System.out.println("taille "+taille);
			for (int i = 0; i < taille; i++) {
				Equipe nouvelleEquipe = new Equipe();
				j = listeJoueurs.get(random.nextInt(listeJoueurs.size()));
				nouvelleEquipe.equipe.add(j);
				listeJoueurs.remove(j);
				listeEquipe.add(nouvelleEquipe);
			}
			System.out.println("taille "+listeEquipe.size());
		}
		else
		{
			int taille = listeJoueurs.size()/2;
			for (int i = 0; i < taille; i++) {
				Equipe nouvelleEquipe = new Equipe();
				j = listeJoueurs.get(random.nextInt(listeJoueurs.size()));
				nouvelleEquipe.equipe.add(j);
				listeJoueurs.remove(j);
				
				j = listeJoueurs.get(random.nextInt(listeJoueurs.size()));
				nouvelleEquipe.equipe.add(j);
				listeJoueurs.remove(j);
				listeEquipe.add(nouvelleEquipe);
			}
		}
		System.out.println("liste équipe "+listeEquipe.size());
	}

	private void CreationEquipeMixte() {
		Random random = new Random();
		Joueur j = new Joueur();
		List<Joueur> listeJoueurHomme = j.joueurParGenre(true);
		List<Joueur> listeJoueurFemme = j.joueurParGenre(false);
		int taille = listeJoueurHomme.size()/2;
		for (int i = 0; i < taille; i++) {
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

	public void selectionEquipe(int type) {
		if (type == 1) {
			CreateEquipe(true, true); // true = homme, true = simple
		} else if (type == 2) {
			CreateEquipe(false, true);
		} else if (type == 3) {
			CreateEquipe(true, false);
		} else if (type == 4) {
			CreateEquipe(false, false);
		} else {
			CreationEquipeMixte();
		}

	}
	@Override
	public String toString() {
		return "Equipe [equipe=" + equipe + ", nbrVictoire=" + nbrVictoire + "]";
	}

}
