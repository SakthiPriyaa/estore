package estore.frontend.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.ProductDao;
import com.nec.estore.backend.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping(value="/stock", method=RequestMethod.GET)
	public ModelAndView stockHome(){
		ModelAndView mv=new ModelAndView("stock");
		return mv;
}
	@RequestMapping(value="/stock", method=RequestMethod.POST)
	public ModelAndView returnStock(){
		ModelAndView mv=new ModelAndView("stock","command",new Product());
		return mv;
}

	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView viewAdd(){
		ModelAndView mv=new ModelAndView("add","command",new Product());
		return mv;
}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	 public ModelAndView addProduct(@ModelAttribute("product") Product product){
		productDao.save(product);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public ModelAndView viewDelete(){
		ModelAndView mv=new ModelAndView("delete","command",new Product());
		return mv;
}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	 public ModelAndView deleteProduct(HttpServletRequest request, HttpServletResponse response){
		String id=request.getParameter("id");
		//Product product=productDao.delete(id);	
		productDao.delete(id);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public ModelAndView viewUpdate(){
		ModelAndView mv=new ModelAndView("add","command",new Product());
		return mv;
}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	 public ModelAndView updateProduct(@ModelAttribute("product") Product product){
		productDao.update(product);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }
	

}
