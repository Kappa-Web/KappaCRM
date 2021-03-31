package KappaCRM.Model;

public class CModelLitige {

	private long id;
	private String libelle;
	private byte[] photo;
	private long fkIdCrise;
	private long fkIdEntite;
	
	
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
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public long getFkIdCrise() {
		return fkIdCrise;
	}
	public void setFkIdCrise(long fkIdCrise) {
		this.fkIdCrise = fkIdCrise;
	}
	public long getFkIdEntite() {
		return fkIdEntite;
	}
	public void setFkIdEntite(long fkIdEntite) {
		this.fkIdEntite = fkIdEntite;
	}
	
	
	
}
