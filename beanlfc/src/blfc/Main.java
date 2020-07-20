package blfc;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	    Custom cs=(Custom)context.getBean("custom");
	    ((AbstractApplicationContext)context).registerShutdownHook();
	}
}
