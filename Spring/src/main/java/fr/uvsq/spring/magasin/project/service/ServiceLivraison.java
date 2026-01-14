package fr.uvsq.spring.magasin.project.service;

import java.util.ArrayList;
import java.util.List;

import fr.uvsq.spring.magasin.project.entity.Livraison;
import fr.uvsq.spring.magasin.project.entity.Options;

public class ServiceLivraison {
	
	String nom;
	Livraison livraison;
	List<Options> listOptions = new ArrayList<>();
	
	public ServiceLivraison(String nom, Livraison typeLivraison) {
		this.nom = nom;
		this.livraison = typeLivraison;
	}
	
	public Livraison getLivraison() {
		return livraison;
	}
	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}
	public List<Options> getListOptions() {
		return listOptions;
	}
	public void setListOptions(List<Options> listOptions) {
		this.listOptions = listOptions;
	}

	public void affichage() {
		System.out.println("nom : " + nom + "\n");
		livraison.livre();
		for (Options o : listOptions) {
			o.AfficheOption();
		}
		
	}
	
}
