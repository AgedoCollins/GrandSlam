package be.collins.dao;

import java.sql.Connection;

import be.collins.pojo.Equipe;

public class EquipeDAO extends DAO<Equipe> {

	public EquipeDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Equipe obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Equipe obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Equipe obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Equipe find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
