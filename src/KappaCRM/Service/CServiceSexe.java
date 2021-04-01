package KappaCRM.Service;

import java.sql.SQLException;
import java.util.List;

import KappaCRM.Model.CModelSexe;
import KappaCRM.Repository.CRepositorySexe;

public class CServiceSexe {

	public List<CModelSexe> GetAllSexe(){
		CRepositorySexe repositorySexe = new CRepositorySexe();
		try {
			return repositorySexe.findAll();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
}
