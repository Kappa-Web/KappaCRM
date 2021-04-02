package KappaCRM.Controller;

import java.io.IOException;
import java.sql.SQLException;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Model.CModelIncident;
import KappaCRM.Repository.CRepositoryIncident;
import KappaCRM.Service.CServiceIncident;
import KappaCRM.Utility.CUtilityValidation;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class CControllerDeclarationIncident extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		if (CUtilityValidation.CompteIsValid(session)) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/DeclarationIncident.jsp").forward(request,
					response);
		} else {
			response.sendRedirect("/KappaCRM");
		}

	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		System.out.println("declaration");
		
		HttpSession session = request.getSession();
		CModelCompte compte = (CModelCompte)session.getAttribute("compte");
		CModelIncident incident = new CModelIncident();
		incident.setFkIdEntiteDeclarant(compte.getFk_id_entity());
		incident.setLibelle(request.getParameter("Libelle").toString());
		incident.setDescription(request.getParameter("Description").toString());
		incident.setLieu(request.getParameter("Position").toString());
		
		CServiceIncident serviceIncident = new CServiceIncident();
		serviceIncident.insertIncident(incident);
		

	}

}
