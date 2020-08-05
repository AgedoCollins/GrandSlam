package be.collins.dao;

import java.sql.Connection;

import be.collins.pojo.Match;

public class MatchDAO extends DAO<Match> {

	public MatchDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Match obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Match obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Match obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Match find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
