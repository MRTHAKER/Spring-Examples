package library.management;
import javax.servlet.http.*;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.*;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView; 

@Controller
public class Controllers {
@RequestMapping("/login")
public ModelAndView login(HttpServletRequest req) {
	if(req.getParameter("name").equals("library")&& req.getParameter("pass").equals("1234")) {
		return new ModelAndView("Add_book");
	}
	else {
		return new ModelAndView("Wrong");
	}
	
}
}
