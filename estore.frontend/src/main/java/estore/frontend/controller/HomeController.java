package estore.frontend.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView showHome(){
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	@RequestMapping(value="admin/home", method=RequestMethod.GET)
	public ModelAndView showMyHome(){
		ModelAndView mv=new ModelAndView("redirect:stock");
		return mv;
	}
	

	
	
	
}
