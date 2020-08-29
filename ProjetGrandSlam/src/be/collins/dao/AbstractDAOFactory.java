package be.collins.dao;
import be.collins.pojo.*;

public abstract class AbstractDAOFactory {
	
	public static  final int DAO_FACTORY = 0;
		
	public abstract DAO<Joueur> getJoueurDAO();
	public abstract DAO<Arbitre> getArbitreDAO();
	public abstract DAO<Admin> getAdminDAO();
	public abstract DAO<Court> getCourtDAO();
	
	public static AbstractDAOFactory getFactory(int type)
	{
		switch(type)
		{
			case DAO_FACTORY:
				return new DAOFactory();
			default:
				return null;
		}
	}
}
