package KappaCRM.Utility;

import KappaCRM.Model.CModelCompte;
import jakarta.servlet.http.HttpSession;

public class CUtilityValidation {

	public static boolean CompteIsValid(HttpSession session) {
		return session.getAttribute("compte") != null || ((CModelCompte)session.getAttribute("compte")).getId() != 0;
	}
}
