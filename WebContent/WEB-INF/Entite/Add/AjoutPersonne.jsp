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


<jsp:include page="Select.jsp" />  



        <form method="post" action="">
            <fieldset>
                <legend>Information</legend>               
                <label for="nom">Nom <span class="requis">*</span></label>
                <input type="text" id="Nom" name="Nom" value="" size="20" maxlength="60" />
               
                <br />

                <label for="Prenom">Prénom <span class="requis">*</span></label>
                <input type="text" id="Prenom" name="Prenom" value="" size="20" maxlength="60" />
                <br />

				
                <input type="submit" value="Enregistrer" class="sansLabel" />
                <br />
                      
            </fieldset>
        </form>
	

</div>


</body>
</html>