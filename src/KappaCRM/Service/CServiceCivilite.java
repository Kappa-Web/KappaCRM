package KappaCRM.Service;

import java.sql.SQLException;
import java.util.List;

import KappaCRM.Model.CModelCivilite;
import KappaCRM.Repository.CRepositoryCivilite;

public class CServiceCivilite {

	public List<CModelCivilite> GetAllCivilite(){
		CRepositoryCivilite repositoryCivilite = new CRepositoryCivilite();
		try {
			return repositoryCivilite.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
