package KappaCRM.Controller;

import java.io.IOException;

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
			this.getServletContext().getRequestDispatcher( "/WEB-INF/Profil.jsp" ).forward( request, response );
		}
		else
		{
			response.sendRedirect("/KappaCRM");
		}
		
		
		
	}
}