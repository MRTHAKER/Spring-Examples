package library.management;
import javax.servlet.http.*;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.*;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView; 

@Controller
public class Controllers {
ArrayList<String> ar;
@RequestMapping("/login")
public ModelAndView login(HttpServletRequest req) {
	if(req.getParameter("name").equals("library")&& req.getParameter("pass").equals("1234")) {
		ar=new ArrayList<String>();
		return new ModelAndView("book");
	}
	else {
		return new ModelAndView("Wrong");
	}
	
 }
@RequestMapping("/AddBook")
public ModelAndView AddBook(HttpServletRequest req) {
	
	return new ModelAndView("book");
}
@RequestMapping("/DeleteBook")
public ModelAndView DeleteBook(HttpServletRequest req) {
	return new ModelAndView("AddBook");
}
}
