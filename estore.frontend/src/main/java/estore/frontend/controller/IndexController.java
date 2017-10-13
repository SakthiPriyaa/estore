package estore.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.CustomerDao;
import com.nec.estore.backend.model.Customer;

@Controller
public class IndexController {

	@Autowired
	private CustomerDao customerDao;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("index");
		Customer customer=new Customer();
		customer.setName("Arnav");
		customer.setEmail("arnav@example.com");
		customer.setAddress("Mumbai");
		customer.setContact("9786678222");
		customer.setPassword("arnav");
		customer.setConfirmpassword("arnav");
		
		customerDao.save(customer);
		
		return mv;
}
}
