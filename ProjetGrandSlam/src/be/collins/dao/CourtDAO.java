package be.collins.dao;

import java.sql.Connection;

import be.collins.pojo.Court;

public class CourtDAO extends DAO<Court> {

	public CourtDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Court obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Court obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Court obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Court find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
