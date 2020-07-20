package multiobjsingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	    Scope dra1=(Scope)context.getBean("first");
	    Scope dra2=(Scope)context.getBean("second");
	    System.out.println(dra1==dra2);
	    System.out.println(dra1);
	    System.out.println(dra2);
	}

}
