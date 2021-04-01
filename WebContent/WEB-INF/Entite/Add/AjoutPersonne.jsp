<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Ajout Personne</title>
</head>
<body>

<div>

 <form method="post" action="">
      <label for="typeEntite">Choose a entity :</label>
<select name="typeEntite" id="typeEntite">

    <c:forEach items="${typeEntites}" var="item">
      <option value="<c:out value='${item.id}' />"><c:out value='${item.libelle}' /></option>
	</c:forEach>  
</select>

 <input type="submit" value="Change" class="sansLabel" />    
</form>
	

</div>


</body>
</html>