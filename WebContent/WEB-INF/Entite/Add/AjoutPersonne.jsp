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
                
                
                 <label for="typeEntite">Civilité :</label>
				<select name="civilite" id="civilite">

    			<c:forEach items="${civilites}" var="item">
     				<option value="<c:out value='${item.id}' />">  <c:out value='${item.libelle}' /></option>
				</c:forEach>  
				</select>
				
				<br/>
                              
                <label for="nom">Nom :<span class="requis">*</span></label>
                <input type="text" id="Nom" name="Nom" value="" size="20" maxlength="60" />
               
                <br />

                <label for="prenom">Prénom :<span class="requis">*</span></label>
                <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="60" />
                <br />

				<label for="typeEntite">Sexe :</label>
				<select name="sexe" id="sexe">

    			<c:forEach items="${sexes}" var="item">
     				<option value="<c:out value='${item.id}' />">  <c:out value='${item.libelle}' /></option>
				</c:forEach>  
				</select>
				
				<br/>
				
				<label for="adresse">Adresse :<span class="requis">*</span></label>
                <input type="text" id="adresse" name="adresse" value="" size="20" maxlength="60" />
               
                <br />
                
                <label for="email">Email :<span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" size="20" maxlength="60" />
               
                <br />
                
                <label for="dateNaissance">Date et heure de naissance :<span class="requis">*</span></label>
               <input type="datetime-local" id="dateNaissance">
               
                <br />
                
				<label for="dateMort">Date et heure de mort :<span class="requis">*</span></label>
               <input type="datetime-local" id="dateMort">
               
                <br />
				
				<label for="commentaire">commentaire :<span class="requis">*</span></label>
                <textarea id="commentaire" name="commentaire"></textarea>
               
                <br />
				
				<label for="score">Score :<span class="requis">*</span></label>
                <input type="number" id="score" name="score" value="" min="0" max="100" />
               
                <br />
				
                <input type="submit" value="Enregistrer" class="sansLabel" />
                <br />
                      
            </fieldset>
        </form>
	

</div>


</body>
</html>