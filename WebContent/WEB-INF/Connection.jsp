<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connection</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/connection.css"/>
    </head>
    <body>
    	<form method="post" action="Connection">
            <fieldset>
                <legend>Connection</legend>
                <p>Vous pouvez vous connecter via ce formulaire.</p>
                <div class="form">
                
	                <% if(request.getAttribute("error") != null) {%>
	    			<div class="error">Une erreur a été rencontrée: <%=request.getAttribute("error")%></div>
					<%}%>
	                <label for="nom">Identifiant <span class="requis">*</span></label>
	                <input type="text" id="identifiant" name="identifiant" value="" size="20" maxlength="60" />
	               
	                <br />
	
	                <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
	                <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
	                <br />
	                <br>	
	                <input type="submit" value="Connection" class="sansLabel" />
	                <br />

                </div>    
                
                
            </fieldset>
        </form>
    </body>
</html>