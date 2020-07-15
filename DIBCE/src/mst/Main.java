package mst;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	 Employee em=(Employee)context.getBean("Emp");
	 em.printAll();
	}
	    
}
