package be.collins.dao;

import java.sql.Connection;

import be.collins.pojo.Tournoi;

public class TournoiDAO extends DAO<Tournoi> {

	public TournoiDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Tournoi obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Tournoi obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Tournoi obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tournoi find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
