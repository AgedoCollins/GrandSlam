package be.collins.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.collins.pojo.Admin;

public class AdminDAO extends DAO<Admin> {

	public AdminDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public boolean create(Admin obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean delete(Admin obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean update(Admin obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin find(int id) {
		// TODO Auto-generated method stub
		Admin admin = null;
		
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * from Arbitre WHERE IdAdmin = " + id + ";");
			if(result.first())
			{
				admin = new Admin();
				admin.setIdAdmin(result.getInt("IdAdmin"));
				admin.setNom(result.getString("nom"));
				admin.setPrenom(result.getString("prenom"));
				admin.setSexe(result.getBoolean("sexe"));
				admin.setPseudo(result.getString("pseudo"));
				admin.setMdp(result.getString("mdp"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return admin;
	}

	public ArrayList<Admin> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Admin> listAdmin = new ArrayList<Admin>();
		Admin admin = null;
		
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * from Admin;");
			while(result.next())
			{
				admin = new Admin();
				admin.setIdAdmin(result.getInt("IdAdmin"));
				admin.setNom(result.getString("nom"));
				admin.setPrenom(result.getString("prenom"));
				admin.setSexe(result.getBoolean("sexe"));
				admin.setPseudo(result.getString("pseudo"));
				admin.setMdp(result.getString("mdp"));
				listAdmin.add(admin);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return listAdmin;
	}
}
