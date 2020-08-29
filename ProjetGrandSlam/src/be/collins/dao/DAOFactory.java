package be.collins.dao;

import java.sql.Connection;
import be.collins.pojo.*;

public class DAOFactory extends AbstractDAOFactory {
	
	protected static final Connection conn = ConnexionDB.getInstance();

	@Override
	public DAO<Joueur> getJoueurDAO() {
		// TODO Auto-generated method stub
		return new JoueurDAO(conn);
	}

	@Override
	public DAO<Arbitre> getArbitreDAO() {
		// TODO Auto-generated method stub
		return new ArbitreDAO(conn);
	}

	@Override
	public DAO<Court> getCourtDAO() {
		// TODO Auto-generated method stub
		return new CourtDAO(conn);
	}

	@Override
	public DAO<Admin> getAdminDAO() {
		// TODO Auto-generated method stub
		return new AdminDAO(conn);
	}

}
