package KappaCRM.Model;

import java.util.Date;

public class CModelIncident {

	private long id;
	private String libelle;
	private String description;
	private Date dateAjout;
	private Date dateModification;
	private Date dateFin;
	private String lieu;
	private String statut;
	private long fkIdEntiteSuperviseur;
	private long fkIdEntiteDeclarant;
	private long fkIdMission;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	public Date getDateModification() {
		return dateModification;
	}
	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public long getFkIdEntiteSuperviseur() {
		return fkIdEntiteSuperviseur;
	}
	public void setFkIdEntiteSuperviseur(long fkIdEntiteSuperviseur) {
		this.fkIdEntiteSuperviseur = fkIdEntiteSuperviseur;
	}
	public long getFkIdEntiteDeclarant() {
		return fkIdEntiteDeclarant;
	}
	public void setFkIdEntiteDeclarant(long fkIdEntiteDeclarant) {
		this.fkIdEntiteDeclarant = fkIdEntiteDeclarant;
	}
	public long getFkIdMission() {
		return fkIdMission;
	}
	public void setFkIdMission(long fkIdMission) {
		this.fkIdMission = fkIdMission;
	}
	
}
