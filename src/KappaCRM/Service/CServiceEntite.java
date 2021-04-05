package KappaCRM.Service;

import java.sql.SQLException;

import KappaCRM.Model.CModelEntity;
import KappaCRM.Repository.CRepositoryCivilite;
import KappaCRM.Repository.CRepositoryEntity;
import KappaCRM.Repository.CRepositorySexe;

public class CServiceEntite {

	public void insertEntite(CModelEntity entite) {
		CRepositoryEntity repositoryEntity = new CRepositoryEntity();
		try {
			repositoryEntity.insert(entite);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}
	
	public CModelEntity findById(long id)
	{
		CRepositoryEntity repositoryEntity  = new CRepositoryEntity();
		CRepositoryCivilite repositoryCivilite = new CRepositoryCivilite();
		CRepositorySexe repositorySexe = new CRepositorySexe();
		 try {
			CModelEntity entite = repositoryEntity.findById(id);			
			entite.setCivilite(repositoryCivilite.findById(entite.getFk_civilite()).getLibelle());
			entite.setSexe(repositorySexe.findById(entite.getFk_sexe()).getLibelle());
			return entite;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
