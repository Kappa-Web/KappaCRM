package KappaCRM.Service;

import java.sql.SQLException;

import KappaCRM.Model.CModelEntity;
import KappaCRM.Repository.CRepositoryEntity;

public class CServiceProfil {

	public CModelEntity findById(long id)
	{
		CRepositoryEntity repo = new CRepositoryEntity();
		 try {
			return repo.findById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
