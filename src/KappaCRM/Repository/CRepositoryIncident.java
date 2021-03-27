package KappaCRM.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import KappaCRM.Model.CModelEntity;
import KappaCRM.Model.CModelIncident;
import KappaCRM.Utility.CUtilityStorage;

public class CRepositoryIncident {
	
	public void insert(CModelIncident incident) {
		
		
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("INSERT INTO `incident`(`libelle`, `description`,"
				+ " `date_ajout`, `date_modif`, `date_fin`, `lieu`, `statut`, `fk_id_entite_superviseur`,"
				+ " `fk_id_mission`, `fk_id_entite_declarant`) VALUES"
				+ "(?,?,?,?,?,?,?,?,?,?)");

		state.setLong(1,id);
		
		
		ResultSet result = state.executeQuery();
		
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
	
	}

}
