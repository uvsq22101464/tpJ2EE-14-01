package fr.uvsq.spring.tp4.entity;

public class Identite {

	private Adresse adresse;

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Identite [adresse=" + adresse + "]";
	}
	
	
	
}
