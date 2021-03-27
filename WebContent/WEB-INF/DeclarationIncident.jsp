<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Incident</title>
</head>
<body>
<div>Declaration d'un incident</div>

 <form method="post" action="DeclarationIncident">
            <fieldset>
                <legend>Déclarer un incident</legend>
                <p>Vous pouvez declarer un incident via ce formulaire.</p>
                <label for="Libelle">Identifiant <span class="requis">*</span></label>
                <input type="text" id="Libelle" name="Libelle" value="" size="20" maxlength="60" />
               
                <br />

                <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
                <br />

                <input type="submit" value="Connection" class="sansLabel" />
                <br />
                      
            </fieldset>
</body>
</html>