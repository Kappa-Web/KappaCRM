package KappaCRM.Controller;

import java.io.IOException;
import KappaCRM.Model.CModelCompte;
import KappaCRM.Service.CServiceCompte;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CControllerConnection extends HttpServlet{
	
	
	
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Connection.jsp" ).forward( request, response );
		
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		CServiceCompte service = new CServiceCompte();
		CModelCompte compte =new CModelCompte();
		compte.setIdentifiant(request.getParameter("identifiant"));
		compte.setMotDePasse( request.getParameter("motdepasse"));
		
		if(service.CompteExistByUsernameAndPassword(compte)) {
			compte = service.getCompteByUsernameAndPassword(compte);
			request.getSession().setAttribute("compte", compte);
			response.sendRedirect("/KappaCRM/Main");
		}
		else
		{
			request.setAttribute("error", "identifiant or mot de passe invalide");
			this.getServletContext().getRequestDispatcher( "/WEB-INF/Connection.jsp" ).forward( request, response );
		}
		
	}
}

