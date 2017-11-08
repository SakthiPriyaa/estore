package estore.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.ProductDao;
import com.nec.estore.backend.model.Product;

@Controller
public class CartController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping(value="/cart", method=RequestMethod.GET)
	public ModelAndView getMyProductById(Model model,@RequestParam("id") int pid) {
		ModelAndView mv=new ModelAndView("cart");
		Product product =productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	/*@RequestMapping(value="/mycart", method=RequestMethod.GET)
	public ModelAndView getProductById(Model model,@RequestParam("id") int pid) {
		ModelAndView mv=new ModelAndView("mycart");
		Product product =productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		return mv;
	}*/

}
