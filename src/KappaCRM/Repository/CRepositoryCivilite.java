package KappaCRM.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import KappaCRM.Model.CModelCivilite;

import KappaCRM.Utility.CUtilityStorage;

public class CRepositoryCivilite {

	public List<CModelCivilite> findAll() throws SQLException{
		Connection conn;

		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("SELECT * FROM civilite");


		ResultSet result = state.executeQuery();

		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);

		List<CModelCivilite> civilites = new ArrayList<>();

		while(result.next()) {
			civilites.add(createModel(result));
		}

		return civilites;		
	}
	
	private CModelCivilite createModel(ResultSet result_) throws SQLException {
		CModelCivilite civilite = new CModelCivilite();
		civilite.setId(result_.getLong("id"));
		civilite.setLibelle(result_.getString("libelle"));
		return civilite;
	}
	
	public CModelCivilite findById(long id_) throws SQLException{
		Connection conn;

		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("SELECT * FROM civilite where id = ?");
		state.setLong(1,id_);

		ResultSet result = state.executeQuery();

		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);

		CModelCivilite civilite = new CModelCivilite();

		while(result.next()) {
			civilite=createModel(result);
		}

		return civilite;		
	}

}
