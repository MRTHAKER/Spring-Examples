package mst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ExampleMain {
public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	    Employee emp=(Employee)context.getBean("Employee");  
	    System.out.println(emp.display());  
}
}
