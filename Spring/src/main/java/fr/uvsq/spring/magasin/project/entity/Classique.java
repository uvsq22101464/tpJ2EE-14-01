package fr.uvsq.spring.magasin.project.entity;

public class Classique implements Livraison {

	public int delai;

	@Override
	public void livre() {
		System.out.println("Livraison classique avec un délai de " + delai + " jour(s)");
		
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}
	
	
	
}
