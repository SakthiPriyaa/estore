package estore.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.nec.estore.backend.model.Customer;

import com.nec.estore.backend.dao.CustomerDao;
import com.nec.estore.backend.model.Customer;

@Controller
public class HomeController {

	@Autowired
	private CustomerDao customerDao;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("myhome");
		return mv;
	}
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView viewProducts(){
		ModelAndView mv=new ModelAndView("products");
		return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView register(){
		//ModelAndView mv=new ModelAndView("register");
		ModelAndView mv=new ModelAndView("register","command",new Customer());
		return mv;
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(){
		//ModelAndView mv=new ModelAndView("register");
		ModelAndView mv=new ModelAndView("login","command",new Customer());
		return mv;
	}
	
	/*@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView showProducts(){
		//ModelAndView mv=new ModelAndView("register");
		ModelAndView mv=new ModelAndView("products","command",new Products());
		return mv;
	}*/
	
	
}
