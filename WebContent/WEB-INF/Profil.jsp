<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="KappaCRM.Model.CModelEntity" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profil</title>
</head>
<body>
<div>Profil</div>



<%
CModelEntity entity = (CModelEntity)request.getAttribute("entity");
if(entity != null && entity.getId()!=0)
{
	
	
}
else
{
	out.println("une erreur est survenue");
}

%>

</body>
</html>