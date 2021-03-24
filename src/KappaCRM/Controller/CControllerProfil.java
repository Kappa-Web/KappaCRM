package KappaCRM.Controller;

import java.io.IOException;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Model.CModelEntity;
import KappaCRM.Repository.CRepositoryEntity;
import KappaCRM.Service.CServiceProfil;
import KappaCRM.Utility.CUtilityValidation;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class CControllerProfil extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if(CUtilityValidation.CompteIsValid(session))
		{
			
			CModelCompte compte = (CModelCompte) session.getAttribute("compte");
			
			CServiceProfil serviceProfil = new CServiceProfil();
			CModelEntity entity = serviceProfil.findById(compte.getFk_id_entity());
			request.setAttribute("entity", entity);
			this.getServletContext().getRequestDispatcher( "/WEB-INF/Profil.jsp" ).forward( request, response );
		}
		else
		{
			response.sendRedirect("/KappaCRM");
		}
		
		
		
	}
}
