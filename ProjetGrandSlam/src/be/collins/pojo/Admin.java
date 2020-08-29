package be.collins.pojo;

import java.util.Date;
import java.util.List;

import be.collins.dao.AbstractDAOFactory;
import be.collins.dao.AdminDAO;

public class Admin extends Personne {

	// Variables
	private String pseudo;
	private String mdp;

	// Constructeurs
	public Admin(int idAdmin, String nom, String prenom, Date dateNaissance, boolean sexe, String pseudo, String mdp) {
		super(-1, nom, prenom, dateNaissance, sexe);
		this.pseudo = pseudo;
		this.mdp = mdp;
	}

	public Admin() {
		super();
	}

	// Getter & Setter

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	// Méthodes

	public List<Admin> findAll() {
		AdminDAO administrateurDAO = (AdminDAO) AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY).getAdminDAO();
		List<Admin> listAdministrateurs = administrateurDAO.findAll();
		return listAdministrateurs;
	}

	public boolean connexionAdministrateur(String pseudo, String password) {
		AdminDAO administrateurDAO = (AdminDAO) AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY).getAdminDAO();
		List<Admin> listAdministrateurs = administrateurDAO.findAll();
		boolean is_existe = false;
		for (Admin a : listAdministrateurs) {
			if (a.getPseudo().toLowerCase().equals(pseudo.toLowerCase())
					&& a.getMdp().toLowerCase().equals(password.toLowerCase())) {
				is_existe = true;
			}
		}
		return is_existe;
	}
}
