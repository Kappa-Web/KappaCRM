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
		
			entity = createModel(result);
			
			
		}
		
		
		return entity;
	}
	
	
	public void insert(CModelEntity entity) throws SQLException {
		
		
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("INSERT INTO `entite`(`fk_type`, `nom`,"
				+ " `prenom`, `fk_sexe`, `fk_civilite`, `adresse`, `email`, `numero`, `date_naissance`, "
				+ "`date_mort`, `date_ajout`, `date_modif`, `commentaire`, `nb_incident`, `nb_mission`, `score`)"
				+ " VALUES (?,?,?,?,?,?,?,?,?"
				+ ",?,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,?,?,?,?)");
		
		
		state.setLong(1,entity.getFk_type());
		state.setString(2,entity.getNom());		
		state.setString(3, entity.getPrenom());
		state.setLong(4,entity.getFk_sexe());
		state.setLong(5,entity.getFk_civilite());
		state.setString(6, entity.getAdresse());
		state.setString(7, entity.getEmail());
		state.setString(8, entity.getNumero());
		state.setTimestamp(9, entity.getDate_naissance());
		state.setTimestamp(10, entity.getDate_mort());
		state.setString(11, entity.getCommentaire());
		state.setInt(12, entity.getNb_incident());
		state.setInt(13, entity.getNb_mission());
		state.setInt(14, entity.getScore());
		
		
		state.execute();
	
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
	}
	
	private CModelEntity createModel(ResultSet result) throws SQLException {
		CModelEntity entity = new CModelEntity();
		 
		entity.setId(result.getLong("id"));
		entity.setFk_type(result.getLong("fk_type"));
		entity.setNom(result.getString("nom"));
		entity.setPrenom(result.getString("prenom"));
		entity.setFk_civilite(result.getLong("fk_civilite"));
		entity.setAdresse(result.getString("adresse"));
		entity.setEmail(result.getString("email"));
		entity.setNumero(result.getString("numero"));
		entity.setDate_naissance(result.getTimestamp("date_naissance"));
		entity.setDate_mort(result.getTimestamp("date_mort"));
		entity.setNb_incident(result.getInt("nb_incident"));
		entity.setNb_mission(result.getInt("nb_mission"));
		
		 return entity;
		 
	}
}
