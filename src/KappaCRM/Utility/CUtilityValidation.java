package KappaCRM.Utility;

import KappaCRM.Model.CModelCompte;
import javax.servlet.http.HttpSession;

public class CUtilityValidation {

	public static boolean CompteIsValid(HttpSession session) {
		return session.getAttribute("compte") != null && ((CModelCompte)session.getAttribute("compte")).getId() != 0;
	}
	
	public static String StringOrNull(Object value)
	{
		return value != null ? value.toString() : null;
		
	}
}
