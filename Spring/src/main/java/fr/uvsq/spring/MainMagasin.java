package fr.uvsq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.uvsq.spring.magasin.project.service.ServiceLivraison;



public class MainMagasin {

	public static void main(String[] args) {
		ApplicationContext monContext = new ClassPathXmlApplicationContext("MagasinConfig.xml");
		ServiceLivraison magasin = (ServiceLivraison) monContext.getBean("ServLivr");
		magasin.affichage();
		
	}		
}

