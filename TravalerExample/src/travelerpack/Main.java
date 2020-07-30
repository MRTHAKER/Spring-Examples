package travelerpack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		 Traveler tra=(Traveler)context.getBean("tra");
		 Traveler tra2=(Traveler)context.getBean("tra2");
		 System.out.println(tra.toString());
		 System.out.println(tra2.toString());
		
	}

}
