package KappaCRM.Initialization;

import java.sql.SQLException;

import KappaCRM.Infrastructure.CInfraBasicConnectionPool;
import KappaCRM.Utility.CUtilityStorage;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Shutting down!");
		try {
			CUtilityStorage.getBasicConnectionPool().shutdown();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		  System.out.println("Starting up!");
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			CUtilityStorage.setBasicConnectionPool(CInfraBasicConnectionPool.create("jdbc:mysql://localhost:3306/projet_kappa", "root", ""));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
