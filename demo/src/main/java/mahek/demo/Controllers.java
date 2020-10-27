package mahek.demo;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.*;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  
import javax.servlet.http.*;

@Controller
public class Controllers {
@RequestMapping("/hello")
public ModelAndView helloo(HttpServletRequest req) {
	return new ModelAndView("hello");
}
}
