package fr.uvsq.spring.tp4.entity;

public class Reference {

	private String siret;

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	@Override
	public String toString() {
		return "Reference [siret=" + siret + "]";
	}
	
	
	
}
