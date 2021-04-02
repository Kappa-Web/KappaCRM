<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="KappaCRM.Model.CModelCompte" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
</head>
<body>
<div>Bienvenue  
<%
	CModelCompte c = (CModelCompte)session.getAttribute("compte");
    out.print((String)c.getIdentifiant()); 
%>

</div>

<form action="Profil">
    <input type="submit" value="Profil" />
</form>

<form action="Incident/Declaration">
    <input type="submit" value="Declarer un incident" />
</form>

<form action="Litige">
    <input type="submit" value="Litige" />
</form>
</body>
</html>