package KappaCRM.Controller;

import java.io.IOException;
import java.util.List;

import KappaCRM.Model.CModelCompte;
import KappaCRM.Model.CModelTypeEntite;
import KappaCRM.Service.CServiceCompte;
import KappaCRM.Service.CServiceTypeEntite;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class CControllerAjoutEntite  extends HttpServlet{

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{

		//System.out.print(request.getAttribute("typeEntites"));

			CServiceTypeEntite serviceTypeEntite = new CServiceTypeEntite();
			List<CModelTypeEntite> typeEntites = serviceTypeEntite.getAllTypeEntite();
			request.setAttribute("typeEntites", typeEntites);
			
		HttpSession session = request.getSession();
		
		if(session.getAttribute("typeEntite")== null) {
			session.setAttribute("typeEntite","1");
		}
		
				
		switch(session.getAttribute("typeEntite").toString()) {
		  case "1":
			  this.getServletContext().getRequestDispatcher( "/WEB-INF/Entite/Add/AjoutPersonne.jsp" ).forward( request, response );
		    break;
		  case "2":
			  this.getServletContext().getRequestDispatcher( "/WEB-INF/Entite/Add/AjoutSuper.jsp" ).forward( request, response );
		    break;
		  case "3":
			  this.getServletContext().getRequestDispatcher( "/WEB-INF/Entite/Add/AjoutOrganisation.jsp" ).forward( request, response );
			  break;
		  default:
			  this.getServletContext().getRequestDispatcher( "/WEB-INF/Entite/Add/AjoutPersonne.jsp" ).forward( request, response );
		}
		
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		//System.out.print(request.getParameter("typeEntite"));
	
		request.getSession().setAttribute("typeEntite", request.getParameter("typeEntite"));
		response.sendRedirect("/KappaCRM/Entite/AjoutEntite");
		
		
		
	}
}