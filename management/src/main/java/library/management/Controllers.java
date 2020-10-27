package library.management;
import javax.servlet.http.*;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.*;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView; 

@Controller
public class Controllers {
ArrayList<BooksBean> ar;
@RequestMapping("/login")
public ModelAndView login(HttpServletRequest req) {
	if(req.getParameter("name").equals("library")&& req.getParameter("pass").equals("1234")) {
		ar=new ArrayList<BooksBean>();
		return new ModelAndView("book");
	}
	else {
		return new ModelAndView("Wrong");
	}
	
 }
@RequestMapping("/AddBook")
public ModelAndView AddBook(HttpServletRequest req) {
	return new ModelAndView("AddBook");
}
@RequestMapping("/AddBookBean")
public ModelAndView AddBookBean(HttpServletRequest req) {
	BooksBean b=new BooksBean();
	boolean EBookAvailable;
	b.setBookAuthorName(req.getParameter("BookAuthorName"));
	b.setBookName(req.getParameter("BookName"));
	b.setBookTitle(req.getParameter("BookTitle"));
	b.setEdition(req.getParameter("Edition"));
	b.setPublisherName(req.getParameter("PublisherName"));
	b.setNumberOfCopies(Integer.parseInt(req.getParameter("NumberOfCopies")));
	if((req.getParameter("EBookAvailable").equals("yes"))){
		EBookAvailable=true;
	}
	else {
		EBookAvailable=false;
	}
	b.setEBookAvailable(EBookAvailable);
	ar.add(b);
	return new ModelAndView("book");
	
}
@RequestMapping("/DeleteBook")
public ModelAndView DeleteBook(HttpServletRequest req) {
	return new ModelAndView("AddBook");
}
@RequestMapping("/DisplayBooks")
public void DisplayBooks(HttpServletRequest req) {
	for(int i=0;i<ar.size();i++) {
		ar.get(i).getBookName();
	}
}
}
