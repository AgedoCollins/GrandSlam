package be.collins.dao;

import java.sql.Connection;

import be.collins.pojo.Ordonnancement;

public class OrdonnancementDAO extends DAO<Ordonnancement> {

	public OrdonnancementDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Ordonnancement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Ordonnancement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Ordonnancement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ordonnancement find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
