package fr.uvsq.spring.tp4.entity;

public class Fournisseur {

	private String nom;
	private Reference ref;
	
	public Fournisseur(Reference ref) {
		this.ref = ref;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Reference getRef() {
		return ref;
	}

	public void setRef(Reference ref) {
		this.ref = ref;
	}

	@Override
	public String toString() {
		return "Fournisseur [nom=" + nom + ", ref=" + ref + "]";
	}
	
	
	
}
