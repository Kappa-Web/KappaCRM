package KappaCRM.Service;

import java.sql.SQLException;
import java.util.List;

import KappaCRM.Model.*;
import KappaCRM.Repository.CRepositoryTypeEntite;
public class CServiceTypeEntite {

	public List<CModelTypeEntite> getAllTypeEntite() {
		CRepositoryTypeEntite repositoryTypeEntite = new CRepositoryTypeEntite();
		try {
			return repositoryTypeEntite.FindAll();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
