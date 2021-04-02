package KappaCRM.Service;

import java.sql.SQLException;

import KappaCRM.Model.CModelEntity;
import KappaCRM.Repository.CRepositoryEntity;

public class CServiceEntite {

	public void insertEntite(CModelEntity entite) {
		CRepositoryEntity repositoryEntity = new CRepositoryEntity();
		try {
			repositoryEntity.insert(entite);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
