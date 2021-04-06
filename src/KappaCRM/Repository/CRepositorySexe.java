package KappaCRM.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import KappaCRM.Model.CModelSexe;
import KappaCRM.Utility.CUtilityStorage;

public class CRepositorySexe {

	public List<CModelSexe> findAll() throws SQLException{
		
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("SELECT * FROM sexe ");

		
			
		ResultSet result = state.executeQuery();
		
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
		
		List<CModelSexe> sexes = new ArrayList<>();
		
		while(result.next())
		{
			sexes.add(createModel(result));
		}
		
		
		
		return sexes;
	}
	
	public CModelSexe createModel(ResultSet result_) throws SQLException {
		CModelSexe sexe = new CModelSexe();
		sexe.setId(result_.getLong("id"));
		sexe.setLibelle(result_.getString("libelle"));
		return sexe;
	}
	
	
	public CModelSexe findById(long id) throws SQLException{
		
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("SELECT * FROM sexe where id = ?");

		state.setLong(1, id);
			
		ResultSet result = state.executeQuery();
		
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
		
		CModelSexe sexe = new CModelSexe();
		
		while(result.next())
		{
			sexe =createModel(result);
		}
		
		
		
		return sexe;
	}
}
