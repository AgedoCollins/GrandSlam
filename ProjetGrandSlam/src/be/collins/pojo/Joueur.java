package be.collins.pojo;

import java.util.Date;

public class Joueur extends Personne {
	//variables
	private int classement;

	// constructor
	public Joueur(String nom, String prenom, boolean sexe, Date dateNaissance, int classement) {
		super(nom, prenom, sexe, dateNaissance);
		this.classement = classement;
	}

	public Joueur() {
		super();
	}

	// getters & setters
	public int getClassement() {
		return classement;
	}

	public void setClassement(int classement) {
		this.classement = classement;
	}

	// Methodes
	public Joueur joueurParId(int id) {
		JoueurDAO joueurDAO = (JoueurDAO) AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY).getJoueurDAO();
		Joueur joueur = JoueurDAO.Find(id);
		return joueur;
	}

	public List<Joueur> joueurParGenre(boolean b) {
		JoueurDAO joueurDAO = (JoueurDAO) AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY).getJoueurDAO();
		List<Joueur> list = JoueurDAO.getByGender(b);
		return list;
	}
}
