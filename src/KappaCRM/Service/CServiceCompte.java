package KappaCRM.Service;

import java.sql.SQLException;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Repository.CRepositoryCompte;

public class CServiceCompte {

	public boolean CompteExistByUsernameAndPassword(CModelCompte compte)   {
		
		CRepositoryCompte repo = new CRepositoryCompte();
		
		try {
			return repo.existValidByUsernameAndPassword(compte);
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
	}
	
	public CModelCompte getCompteByUsernameAndPassword(CModelCompte compte)  {
		CRepositoryCompte repo = new CRepositoryCompte();
		try {
			return repo.findByUsername(compte);
		} catch (SQLException e) {
		
			e.printStackTrace();
			return new CModelCompte();
		}
	}
}
