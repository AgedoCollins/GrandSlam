package be.collins.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	public ArrayList<Court> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Court> listCourt = new ArrayList<Court>();
		Court court = null;

		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * from court;");
			while (result.next()) {
				court = new Court();
				court.setIdCourt(result.getInt("IdCourt"));
				court.setNbreSpectateur(result.getInt("nbrespectateur"));
				court.setCouvert(result.getBoolean("couvert"));
				court.setTypeSurface(result.getString("typeSurface"));
				listCourt.add(court);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCourt;
	}

}
