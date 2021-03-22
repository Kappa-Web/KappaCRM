package KappaCRM.Controller;

import java.io.IOException;

import KappaCRM.Model.CModelCompte;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CControllerMain  extends HttpServlet{

public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
	
	if(request.getSession().getAttribute("compte") == null or)


	this.getServletContext().getRequestDispatcher( "/WEB-INF/Civil/MainCivil.jsp" ).forward( request, response );
		
	}
	
}
