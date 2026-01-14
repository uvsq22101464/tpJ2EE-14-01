package fr.uvsq.spring.magasin.project.entity;

public class OptionRetour implements Options {

	public int retour;

	public Integer getRetour() {
		return retour;
	}

	public void setRetour(Integer retour) {
		this.retour = retour;
	}
	
	@Override
	public void AfficheOption() {
		System.out.println("Retour dans : " + retour);
	}
	
}
