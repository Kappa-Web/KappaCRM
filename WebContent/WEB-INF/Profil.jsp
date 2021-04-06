<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="KappaCRM.Model.CModelEntity" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profil</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/profil.css"/>
</head>
<body>
<div>Profil</div>



<%
CModelEntity entity = (CModelEntity)request.getAttribute("entity");
if(entity != null && entity.getId()!=0)
{
	String completName = entity.getCivilite() + " " + entity.getNom() +" " + entity.getPrenom() ;
%>
	
	<div><% out.print(completName); %></div>
	<div></div>
	
	<%	
}
else
{
	out.println("une erreur est survenue");
}

%>

</body>
</html>