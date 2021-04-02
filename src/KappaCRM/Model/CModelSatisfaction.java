package KappaCRM.Model;

import java.util.Date;

public class CModelSatisfaction {

	private long id;
	private String titre;
	private String commentaire;
	private int score;
	private Date dateAjout;
	private Date dateModif;
	private Date dateFin;
	private long fkIdRapport;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	public Date getDateModif() {
		return dateModif;
	}
	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public long getFkIdRapport() {
		return fkIdRapport;
	}
	public void setFkIdRapport(long fkIdRapport) {
		this.fkIdRapport = fkIdRapport;
	}
	
}
