package estore.frontend.controller;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.CustomerDao;
import com.nec.estore.backend.model.Customer;

@Controller
public class LoginController {
	@Autowired
	private CustomerDao customerDao;
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mv=new ModelAndView("login","command",new Customer());
		return mv;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response){		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Customer customer=customerDao.findByEmail(email,password);	
		//request.setAttribute("customer", customer );
		ModelAndView mv=null;
		if(customer!=null){
			HttpSession session=request.getSession(true);
			session.setAttribute("name", customer.getName());
			session.setAttribute("email", customer.getName());
			
			if(email=="admin@example.com") {
				mv=new ModelAndView("stock");
			}
			else {
				mv=new ModelAndView("usrhome");
			}
			
		}
		else{
			mv=new ModelAndView("login");		
			//mv.getModelMap().addAttribute("customer", customer);
		}			
		return mv;
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){
		HttpSession session=request.getSession(false);
		if(session!=null)
		 	session.invalidate();
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	
	/*@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response){
		String email=request.getParameter("email");
		String password=request.getParameter("password");		
		ModelAndView mv=null;
		if(customerDao.validate(email, password)==true){
			mv=new ModelAndView("usrhome");
			//mv.getModelMap().addAttribute("customer", customer);
		}else{
			mv=new ModelAndView("register");		
			//mv.getModelMap().addAttribute("customer", customer);
		}			
		return mv;
	
	}*/

}
