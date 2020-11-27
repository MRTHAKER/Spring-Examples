package book.books;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
import java.util.List;
import book.books.Booksdao;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Booksdao bdao = (Booksdao)context.getBean("bdao");
		Books b=new Books();
		Scanner sc=new Scanner(System.in);
		String Brand,Type,ForGender,AvailableOn;
	    int Price,Size; 
	    System.out.println("Enter Book Brand: ");
	    Brand=sc.next();
	    System.out.println("Enter Book Type(Ethnic, Western) ");
	    Type=sc.next();
	    System.out.println("Enter ForGender: ");
	    ForGender=sc.next();
	    System.out.println("Enter AvailableOn: ");
	    AvailableOn=sc.next();
	    System.out.println("Enter AvailableOn: ");
	    Price=sc.nextInt();
	    System.out.println("Enter AvailableOn: ");
	    Size=sc.nextInt();
	    b.setBrand(Brand);
	    b.setType(Type);
	    b.setAvailableOn(AvailableOn);
	    b.setForGender(ForGender);
	    b.setPrice(Price);
	    b.setSize(Size);
	    List<Books> list=bdao.getAllBooksRowMapper();  
        
	    for(Books bb:list) {  
	    System.out.println(bb.getAvailableOn());
	    System.out.println(bb.getBrand());
	    System.out.println(bb.getForGender());
	    System.out.println(bb.getPrice());
	    System.out.println(bb.getSize());
	    System.out.println(bb.getType());
	    }
	    
}
}
