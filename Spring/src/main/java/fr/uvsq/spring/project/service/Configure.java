package fr.uvsq.spring.project.service;

public class Configure implements ConfigureInterface {
	
	Langue maLangue;
	Systeme monSysteme;

	
	public Langue getMaLangue() {
		return maLangue;
	}
	public void setMaLangue(Langue maLangue) {
		this.maLangue = maLangue;
	}
	public Systeme getMonSysteme() {
		return monSysteme;
	}
	public void setMonSysteme(Systeme monSysteme) {
		this.monSysteme = monSysteme;
	}
	
	public void affiche() {
		System.out.println("langue : " + maLangue.afficheConfiguration() + "\n systeme : " + monSysteme.afficheConfiguration());
	}
	
}
