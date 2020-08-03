package q2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import q2.Studentdao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Studentdao studdao = (Studentdao)context.getBean("sdao");
		//Inserted using Getter setter
		/*Student st=(Student)context.getBean("q");
		int k=studdao.saveStudent(st);
		if(k>0) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Error");
		}*/
		Student st2=(Student)context.getBean("qq");
		int kk=studdao.saveStudent(st2);
		if(kk>0) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Error");
		}
		// Rest of Update and Delete works fine also with calling them from their respective objects
		/*int kk=studdao.deleteStudent(st2);
		if(kk>0) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Error");
		}*/
		/*int kk=studdao.updateStudent(st2);
		if(kk>0) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Error");
		}*/
		
	}

}
