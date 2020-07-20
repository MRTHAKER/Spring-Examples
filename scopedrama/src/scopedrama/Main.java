package scopedrama;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	    DramaClass dra1=(DramaClass)context.getBean("drama");
	    dra1.setMessage("hello world");
	    dra1.getMessage();
	    DramaClass dra2=(DramaClass)context.getBean("drama");
	    dra2.setMessage("how are you?");
	    dra2.getMessage();
	    dra1.getMessage();
	}

}
