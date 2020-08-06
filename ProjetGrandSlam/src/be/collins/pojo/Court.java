package be.collins.pojo;
import java.util.ArrayList;
import java.util.List;

import be.collins.dao.AbstractDAOFactory;
import be.collins.dao.CourtDAO;

public class Court {

	//Variables
	private int idCourt;
	private int nbreSpectateur;
	private boolean couvert;
	private String typeSurface;
	
	//Constructeur
	public Court(int idCourt, int nbreSpectateur, boolean couvert, String typeSurface) {
		this.idCourt = idCourt;
		this.nbreSpectateur = nbreSpectateur;
		this.couvert = couvert;
		this.typeSurface = typeSurface;
	}

	public Court(int nbreSpectateur, boolean couvert, String typeSurface) {
		super();
		this.nbreSpectateur = nbreSpectateur;
		this.couvert = couvert;
		this.typeSurface = typeSurface;
	}
	
	public Court() {
	}

	//Getter & Setter
	public int getIdCourt() {
		return idCourt;
	}

	public void setIdCourt(int idCourt) {
		this.idCourt = idCourt;
	}

	public int getNbreSpectateur() {
		return nbreSpectateur;
	}

	public void setNbreSpectateur(int nbreSpectateur) {
		this.nbreSpectateur = nbreSpectateur;
	}

	public boolean isCouvert() {
		return couvert;
	}

	public void setCouvert(boolean couvert) {
		this.couvert = couvert;
	}

	public String getTypeSurface() {
		return typeSurface;
	}

	public void setTypeSurface(String typeSurface) {
		this.typeSurface = typeSurface;
	}	
	
	//Méthodes
	public ArrayList<Court> findAll() {
		// TODO Auto-generated method stub
		CourtDAO courtDao = (CourtDAO) AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY).getCourtDAO();
		return courtDao.findAll();
	}
}
