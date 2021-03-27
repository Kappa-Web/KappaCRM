package KappaCRM.Controller;

import java.io.IOException;
import java.sql.SQLException;

import KappaCRM.Model.CModelIncident;
import KappaCRM.Repository.CRepositoryIncident;
import KappaCRM.Utility.CUtilityValidation;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
		
		CModelIncident incident = new CModelIncident();
		
		
		CRepositoryIncident repo = new CRepositoryIncident();
		
		try {
			repo.insert(incident);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
