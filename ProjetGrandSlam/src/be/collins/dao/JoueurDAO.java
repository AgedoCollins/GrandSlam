package be.collins.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import be.collins.pojo.Court;
import be.collins.pojo.Joueur;

public class JoueurDAO extends DAO<Joueur> {

	public JoueurDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Joueur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Joueur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Joueur obj) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Joueur find(int id) {
		Joueur joueur = new Joueur();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(
							"SELECT * FROM joueur WHERE id = "+id+";");
			if (result.first()) {
				joueur.setId(result.getInt("id"));
				joueur.setNom(result.getString("nom"));
				joueur.setPrenom(result.getString("prenom"));
				joueur.setSexe(result.getBoolean("sexe"));
				joueur.setDateNaissance(result.getDate("datenaissance"));
				joueur.setClassement(result.getInt("classement"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return joueur;
	}

	public List<Joueur> findAll() {
		List<Joueur> list = new ArrayList<Joueur>();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * from Joueur;");
			while (result.next()) {
				Joueur joueur = new Joueur();
				joueur.setId(result.getInt("id"));
				joueur.setNom(result.getString("nom"));
				joueur.setPrenom(result.getString("prenom"));
				joueur.setSexe(result.getBoolean("sexe"));
				joueur.setDateNaissance(result.getDate("datenaissance"));
				joueur.setClassement(result.getInt("classement"));

				list.add(joueur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Joueur> findByGendre(boolean b) {
		List<Joueur> list = new ArrayList<Joueur>();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM joueur WHERE sexe="+ b+";");
			while (result.next()) {
				Joueur joueur = new Joueur();
				joueur.setId(result.getInt("id"));
				joueur.setNom(result.getString("nom"));
				joueur.setPrenom(result.getString("prenom"));
				joueur.setSexe(result.getBoolean("sexe"));
				joueur.setDateNaissance(result.getDate("datenaissance"));
				joueur.setClassement(result.getInt("classement"));
				list.add(joueur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}