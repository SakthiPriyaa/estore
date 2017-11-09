package estore.frontend.controller;



import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.CustomerDao;
import com.nec.estore.backend.dao.ProductDao;
import com.nec.estore.backend.model.Customer;


@Controller
public class HomeController {
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv=new ModelAndView("home");
		Principal principal=request.getUserPrincipal();
		Customer customer=null;
		if(principal!=null){
			customer=customerDao.findById(principal.getName());
		}
		HttpSession session=request.getSession(false);
		if(session!=null)
		session.setAttribute("customer", customer);
		//mv.getModelMap().addAttribute("customer", customer);
		return mv;
	}
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView showHome(){
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping(value="/accessDenied", method=RequestMethod.GET)
	public ModelAndView showDenial(){
		ModelAndView mv=new ModelAndView("accessdenied");
		return mv;
	}
	
	
	/*@RequestMapping(value="/admin/home", method=RequestMethod.GET)
	public ModelAndView showMyHome(){
		ModelAndView mv=new ModelAndView("redirect:stock");
		return mv;
	}*/
	

	
	
	
}
