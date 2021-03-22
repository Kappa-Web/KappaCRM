package KappaCRM.Model;

import java.util.Date;

public class CModelCompte {

	private long id;
	private String identifiant;
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	private String motDePasse;
	private int typeCompte;
	private Boolean IsValid;
	private Date DateCreation;
	private Date DateFin;
	
	public Boolean getIsValid() {
		return IsValid;
	}
	public void setIsValid(Boolean isValid) {
		IsValid = isValid;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public Date getDateFin() {
		return DateFin;
	}
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public int getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(int typeCompte) {
		this.typeCompte = typeCompte;
	}
	
	
}
