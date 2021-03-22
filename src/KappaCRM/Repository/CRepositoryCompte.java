package KappaCRM.Repository;

import java.util.List;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Utility.CUtilityStorage;

import java.sql.*;

public class CRepositoryCompte {
	
	public List<CModelCompte> findAll() {
		
		
		Connection conn;
		
		/*	conn = CUtilityStorage.getBasicConnectionPool().getConnection();
			PreparedStatement state = conn.prepareStatement("SELECT EXISTS(SELECT * FROM "
					+ "comptes WHERE `username` =  ? AND mot_de_passe = ?) as result");
			
			
			
			ResultSet result = state.executeQuery();	
			
			CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
			result.next();*/
			return null;			
		
	}
	
	public CModelCompte findById(CModelCompte compte) {
		
		return null;
		
	}
	
	public CModelCompte findByUsername(CModelCompte compte) throws SQLException {
		
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("SELECT * FROM comptes WHERE `username` =  ? AND mot_de_passe = ?");

		state.setString(1, compte.getIdentifiant());
		state.setString(2, compte.getMotDePasse());
		
		ResultSet result = state.executeQuery();
		
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
		
		result.next();
		
		compte.setId(result.getInt(1));
		compte.setTypeCompte(result.getString(4));
		
		return compte;
		
	}
	
	
	
	public boolean existValidByUsernameAndPassword(CModelCompte compte) throws SQLException
	{
		
		Connection conn;
		
			conn = CUtilityStorage.getBasicConnectionPool().getConnection();
			PreparedStatement state = conn.prepareStatement("SELECT EXISTS(SELECT * FROM "
					+ "comptes WHERE `username` =  ? AND mot_de_passe = ?) as result");
			
			state.setString(1, compte.getIdentifiant());
			state.setString(2, compte.getMotDePasse());
			
			ResultSet result = state.executeQuery();	
			
			CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
			result.next();
			return result.getBoolean(1);			
		
	}
}
