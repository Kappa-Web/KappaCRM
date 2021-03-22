package KappaCRM.Controller;

import java.io.IOException;
import java.sql.SQLException;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Repository.CRepositoryCompte;
import KappaCRM.Service.CServiceConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CControllerConnection extends HttpServlet{
	
	CServiceConnection serviceConnection;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Connection.jsp" ).forward( request, response );
		
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		CRepositoryCompte repo = new CRepositoryCompte();
		
		CModelCompte compte =new CModelCompte();
		compte.setIdentifiant(request.getParameter("identifiant"));
		compte.setMotDePasse( request.getParameter("motdepasse"));
		
		try {
		boolean result = repo.existValidByUsernameAndPassword(compte);
		System.out.print(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getSession().setAttribute("id", request.getParameter("id"));
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Accueil.jsp" ).forward( request, response );
	}
}

