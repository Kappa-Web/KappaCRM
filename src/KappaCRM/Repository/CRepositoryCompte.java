package KappaCRM.Repository;

import java.util.List;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Utility.CUtilityStorage;

import java.sql.*;

public class CRepositoryCompte {
	
	public List<CModelCompte> findAll() {
		return null;
		
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
