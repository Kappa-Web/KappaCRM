package KappaCRM.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import KappaCRM.Model.CModelEntity;
import KappaCRM.Utility.CUtilityStorage;

public class CRepositoryEntity {

	public CModelEntity findById(long id) throws SQLException {
		
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("SELECT * FROM entite WHERE `id` =  ? ");

		state.setLong(1,id);
		
		
		ResultSet result = state.executeQuery();
		
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
		
		CModelEntity entity = new CModelEntity();
		
		if(result.next()) {
		
			entity.setId(result.getLong(1));
			entity.setNom(result.getString(3));
			entity.setPrenom(result.getString(4));
			entity.setCivilite(result.getString(5));
			
			
		}
		
		
		return entity;
	}
}
