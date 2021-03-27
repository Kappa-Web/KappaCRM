package KappaCRM.Repository;

import java.util.ArrayList;
import java.util.List;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Utility.CUtilityStorage;

import java.sql.*;

public class CRepositoryCompte {
	
	public List<CModelCompte> findAll() throws SQLException {
		
		
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("SELECT * FROM comptes");
		
		
		ResultSet result = state.executeQuery();
		
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
		
		List<CModelCompte> comptes = new ArrayList<>();
		
		while(result.next()) {
			comptes.add(InsertValue(result));
		}
		
		return comptes;		
		
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
		
		return InsertValue(result);
		
	}
	
	
	private CModelCompte InsertValue(ResultSet result) throws SQLException {
		
		CModelCompte compte = new CModelCompte();
		compte.setId(result.getInt("id"));
		compte.setIdentifiant("");
		compte.setMotDePasse("");
		compte.setTypeCompte(result.getString("type_compte"));
		compte.setIsValid(result.getBoolean("est_valide"));
		compte.setDateCreation(result.getDate("date_creation"));
		compte.setDateFin(result.getDate("date_fin"));
		compte.setFk_id_entity(result.getLong("fk_id_entite"));
		
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
