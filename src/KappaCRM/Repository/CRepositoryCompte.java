package KappaCRM.Repository;

import java.util.List;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Utility.CUtilityStorage;

import java.sql.*;

public class CRepositoryCompte {
	
	public List<CModelCompte> findAll() {
		return null;
		
	}
	
	public boolean existValidByIdAndPassword(CModelCompte compte) throws SQLException
	{
		
		Connection conn;
		try {
			conn = CUtilityStorage.getBasicConnectionPool().getConnection();
			PreparedStatement state = conn.prepareStatement("SELECT EXISTS(SELECT * FROM "
					+ "comptes WHERE `id` =  ? AND mot_de_passe = ?)");
			
			state.setLong(1, compte.getId());
			state.setString(2, compte.getMotDePasse());
			
			boolean result = state.execute();
			CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
			
			return result;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
			return false;
		}
	}
}
