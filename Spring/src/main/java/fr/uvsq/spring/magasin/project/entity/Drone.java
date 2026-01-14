package fr.uvsq.spring.magasin.project.entity;

public class Drone implements Livraison {

	public String typeLogement;
	
	@Override
	public void livre() {
		System.out.println("Livraison par drone");
		
	}

	public String getTypeLogement() {
		return typeLogement;
	}

	public void setTypeLogement(String typeLogement) {
		this.typeLogement = typeLogement;
	}
	
	
	
}
