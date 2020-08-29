package be.collins.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.collins.pojo.Arbitre;
import be.collins.pojo.Joueur;

public class ArbitreDAO extends DAO<Arbitre> {

	public ArbitreDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Arbitre obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Arbitre obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Arbitre obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Arbitre find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Arbitre> findAll() {		
		List<Arbitre> list = new ArrayList<Arbitre>();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * from arbitre;");
			while (result.next()) {
				Arbitre arbitre = new Arbitre();
				arbitre.setId(result.getInt("idArbitre"));
				arbitre.setNom(result.getString("nom"));
				arbitre.setPrenom(result.getString("prenom"));
				arbitre.setSexe(result.getBoolean("sexe"));
				arbitre.setAnciennete(result.getString("anciennete"));

				list.add(arbitre);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


}
