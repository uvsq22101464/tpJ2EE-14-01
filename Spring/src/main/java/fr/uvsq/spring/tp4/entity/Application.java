package fr.uvsq.spring.tp4.entity;

public class Application {

	private Fournisseur fournisseur;
	private Identite id;
	
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Identite getId() {
		return id;
	}
	public void setId(Identite id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Application [fournisseur=" + fournisseur + ", id=" + id + "]";
	}
	
	
}
