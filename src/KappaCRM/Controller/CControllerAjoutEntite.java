package KappaCRM.Controller;

import java.io.IOException;
import java.util.List;

import KappaCRM.Model.CModelTypeEntite;
import KappaCRM.Service.CServiceTypeEntite;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CControllerAjoutEntite  extends HttpServlet{

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{


		if(request.getAttribute("typeEntites") == null)
		{
			CServiceTypeEntite serviceTypeEntite = new CServiceTypeEntite();
			List<CModelTypeEntite> typeEntites = serviceTypeEntite.getAllTypeEntite();
			request.setAttribute("typeEntites", typeEntites);
		}


		if(request.getAttribute("typeEntite ")== null)
		{
			this.getServletContext().getRequestDispatcher( "/WEB-INF/Entite/Add/AjoutPersonne.jsp" ).forward( request, response );
		}
		else
		{
			long id = (long)request.getAttribute("typeEntite ");
			this.getServletContext().getRequestDispatcher( "/WEB-INF/Entite/Add/AjoutSuper.jsp" ).forward( request, response );
		}


	}
}