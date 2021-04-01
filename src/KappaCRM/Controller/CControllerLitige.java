package KappaCRM.Controller;

import java.io.IOException;

import KappaCRM.Utility.CUtilityValidation;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CControllerLitige extends HttpServlet{
	
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		
		HttpSession session = request.getSession();
		
		if(CUtilityValidation.CompteIsValid(session))
		{
			this.getServletContext().getRequestDispatcher( "/WEB-INF/Civil/LitigeCivil.jsp" ).forward( request, response );
		}
		else
		{
			response.sendRedirect("/KappaCRM");
		}


		
			
		}
		
	}

