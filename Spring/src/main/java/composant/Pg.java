package composant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Pg {

	public static void main(String[] args) {
		ApplicationContext monContext = new ClassPathXmlApplicationContext("maConfig.xml");
		HelloWorld helloWorld = (HelloWorld) monContext.getBean("hW");
		helloWorld.display();
		
	}
	
}
