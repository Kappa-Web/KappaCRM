package KappaCRM.Model;

import java.sql.Timestamp;

public class CModelEntity {

	private long id;
	private long fk_type;
	private String nom;
	private String prenom;
	private long fk_civilite;
	private String adresse;
	private String email;
	private String numero;
	private Timestamp date_naissance;
	private Timestamp date_mort;	
	private int nb_incident;
	private int nb_mission;
	private long fk_sexe;
	private String commentaire;
	private int score;
	
	public int getNb_incident() {
		return nb_incident;
	}

	public void setNb_incident(int nb_incident) {
		this.nb_incident = nb_incident;
	}

	public int getNb_mission() {
		return nb_mission;
	}

	public void setNb_mission(int nb_mission) {
		this.nb_mission = nb_mission;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public CModelEntity() {
		setId(0);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFk_type() {
		return fk_type;
	}
	public void setFk_type(long fk_type) {
		this.fk_type = fk_type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public long getFk_sexe() {
		return fk_sexe;
	}

	public void setFk_sexe(long fk_sexe) {
		this.fk_sexe = fk_sexe;
	}

	public long getFk_civilite() {
		return fk_civilite;
	}

	public void setFk_civilite(long fk_civilite) {
		this.fk_civilite = fk_civilite;
	}

	public Timestamp getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Timestamp date_naissance) {
		this.date_naissance = date_naissance;
	}

	public Timestamp getDate_mort() {
		return date_mort;
	}

	public void setDate_mort(Timestamp date_mort) {
		this.date_mort = date_mort;
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

}
