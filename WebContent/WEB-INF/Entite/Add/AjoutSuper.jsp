<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajout Super</title>
</head>
<body>
<div>
<jsp:include page="Select.jsp" />  

<form method="post" action="">


            <fieldset>
                <legend>Information</legend>             
                              
                <label for="nom">Nom :<span class="requis">*</span></label>
                <input type="text" id="nom" name="nom" value="" size="20" maxlength="60" required/>
               
                <br />

           
				<label for="sexe">Sexe :</label>
				<select name="sexe" id="sexe">

    			<c:forEach items="${sexes}" var="item">
     				<option value="<c:out value='${item.id}' />"><c:out value='${item.libelle}'/></option>
				</c:forEach>  
				</select>
				
				<br/>				
                
                <label for="email">Email :<span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" size="20" maxlength="60"/>
               
                <br />
                
                <label for="numero">Numero :<span class="requis">*</span></label>
                <input type="tel" id="numero" name="numero" value="" size="20" maxlength="60"/>
               
                <br />
                
                <label for="dateNaissance">Date et heure de la première apparition :<span class="requis">*</span></label>
               <input type="datetime-local" id="dateNaissance" name ="dateNaissance">
               
                <br />            
                
                
				<label for="dateMort">Date et heure de mort :<span class="requis">*</span></label>
               <input type="datetime-local" id="dateMort" name ="dateMort">
               
                <br />
				
				<label for="commentaire">commentaire :<span class="requis">*</span></label>
                <textarea id="commentaire" name="commentaire" required></textarea>
               
                <br />
				
				<label for="score">Score :<span class="requis">*</span></label>
                <input type="number" id="score" name="score" value="" min="0" max="100" required/>
               
                <br />
				
                <input type="submit" value="Enregistrer" class="sansLabel" />
                <br />
                      
            </fieldset>
        </form>
</div>
</body>
</html>