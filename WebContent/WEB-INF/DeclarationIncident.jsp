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

 <form method="post" action="">
            <fieldset>
                <legend>Déclarer un incident</legend>
                <p>Vous pouvez declarer un incident via ce formulaire.</p>
                <label for="Libelle">Libéllé <span class="requis">*</span></label>
                <input type="text" id="Libelle" name="Libelle" value="" size="20" maxlength="60" />
               
                <br />

                <label for="Description">Description <span class="requis">*</span></label>
                <textarea id="Description" name="Description"cols="33"></textarea>
                <br />
                
                <label for="Position">Position <span class="requis">*</span></label>
                <input type="text" id="Position" name="Position" value="" size="20" />
                <br />

                <input type="submit" value="Soumettre" class="sansLabel" />
                <br />
                      
            </fieldset>
	</form>
</body>
</html>