package KappaCRM.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import KappaCRM.Model.*;
import KappaCRM.Utility.CUtilityStorage;

public class CRepositoryTypeEntite {

	public List<CModelTypeEntite> FindAll() throws SQLException
	{
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("SELECT * FROM type_entite ");

		
			
		ResultSet result = state.executeQuery();
		
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
		
		List<CModelTypeEntite> typeEntites = new ArrayList<>();
		
		while(result.next())
		{
			typeEntites.add(createModel(result));
		}
		
		
		
		return typeEntites;
	}
	
	private CModelTypeEntite createModel(ResultSet result_) throws SQLException
	{
		CModelTypeEntite typeEntite = new CModelTypeEntite();
		typeEntite.setId(result_.getLong("id"));
		typeEntite.setLibelle(result_.getString("libelle"));
		return typeEntite;
		
	}
}
