package fr.uvsq.spring.magasin.project.entity;

public class OptionPrime implements Options {

	public boolean prime;

	public boolean isPrime() {
		return prime;
	}

	public void setPrime(boolean prime) {
		this.prime = prime;
	}

	@Override
	public void AfficheOption() {
		System.out.println("Option prime : " + prime);
	}
	
}
