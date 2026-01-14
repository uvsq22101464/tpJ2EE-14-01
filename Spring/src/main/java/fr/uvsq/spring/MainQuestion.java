package fr.uvsq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import fr.uvsq.spring.project.service.*;


public class MainQuestion {

	public static void main(String[] args) {
		ApplicationContext monContext = new ClassPathXmlApplicationContext("MesBeansAMoi.xml");
		Fournisseur serviceGestionQuestion = (Fournisseur) monContext.getBean("ServQ");
		serviceGestionQuestion.genereQuestionnaire();
		
		
		Configure conf = (Configure) monContext.getBean("choixEnvironnemnt");
		conf.affiche();
	}		
}

