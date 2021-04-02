package KappaCRM.Service;

import java.sql.SQLException;

import KappaCRM.Model.CModelIncident;
import KappaCRM.Repository.CRepositoryIncident;

public class CServiceIncident {

	public void insertIncident(CModelIncident incident) {
		
		CRepositoryIncident repo = new CRepositoryIncident();
		
		try {
			repo.insert(incident);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
