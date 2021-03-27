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
		
			entity = InsertValue(result);
			
			
		}
		
		
		return entity;
	}
	
	private CModelEntity InsertValue(ResultSet result) throws SQLException {
		CModelEntity entity = new CModelEntity();
		 
		entity.setId(result.getLong("id"));
		entity.setFk_type(result.getLong("fk_type"));
		entity.setNom(result.getString("nom"));
		entity.setPrenom(result.getString("prenom"));
		entity.setCivilite(result.getString("civilite"));
		entity.setAdresse(result.getString("adresse"));
		entity.setEmail(result.getString("email"));
		entity.setNumero(result.getString("numero"));
		entity.setDate_anniversaire(result.getDate("date_anniversaire"));
		entity.setDate_mort(result.getDate("date_mort"));
		entity.setNb_incident(result.getInt("nb_incident"));
		entity.setNb_mission(result.getInt("nb_mission"));
		
		 return entity;
		 
	}
}
