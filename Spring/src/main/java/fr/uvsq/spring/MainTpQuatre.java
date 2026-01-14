package fr.uvsq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.uvsq.spring.tp4.entity.Application;

public class MainTpQuatre {

	public static void main(String[] args) {
		ApplicationContext monContext = new ClassPathXmlApplicationContext("tp4Config.xml");
		Application app= (Application) monContext.getBean("app");
		System.out.println(app);
	
	}
	
}
