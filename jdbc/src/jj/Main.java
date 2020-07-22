package jj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employeedao empdao = (Employeedao)context.getBean("edao");
		Employee e=new Employee();
		e.setId(11);
		e.setName("Jane");
		e.setSalary(1000000);
		int status=empdao.deleteEmployee(e);
		System.out.println("Executed");
		
	}
}
