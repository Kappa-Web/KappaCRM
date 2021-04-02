package KappaCRM.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CControllerSelectEntite  extends HttpServlet{

	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{		
		request.getSession().setAttribute("typeEntite", request.getParameter("typeEntite"));
		response.sendRedirect("/KappaCRM/Entite/AjoutEntite");						
	}
}
