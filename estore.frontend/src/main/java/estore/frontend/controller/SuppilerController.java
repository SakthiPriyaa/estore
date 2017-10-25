package estore.frontend.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.CategoryDao;
import com.nec.estore.backend.dao.ProductDao;
import com.nec.estore.backend.dao.SupplierDao;
import com.nec.estore.backend.model.Category;
import com.nec.estore.backend.model.Product;
import com.nec.estore.backend.model.Supplier;

@Controller
public class SuppilerController {
	@Autowired
	private ProductDao productDao;
	private CategoryDao categoryDao;
	private SupplierDao supplierDao;
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
	
	@RequestMapping(value="/add/product", method=RequestMethod.GET)
	public ModelAndView viewAddProduct(){
		ModelAndView mv=new ModelAndView("add","command",new Product());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	@RequestMapping(value="/add/category", method=RequestMethod.GET)
	public ModelAndView viewAddCategory(){
		ModelAndView mv=new ModelAndView("add","command",new Category());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
/*	@RequestMapping(value="/add/supplier", method=RequestMethod.GET)
	public ModelAndView viewAddSupplier(){
		ModelAndView mv=new ModelAndView("add","command",new Supplier());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}*/
	@RequestMapping(value="/add/product", method=RequestMethod.POST)
	 public ModelAndView addProduct(@ModelAttribute("product") Product product){
		productDao.save(product);
		ModelAndView mv=new ModelAndView("myproducts");
		return mv;
	 }
	@RequestMapping(value="/add/category", method=RequestMethod.POST)
	 public ModelAndView addCategory(@ModelAttribute("category") Category category){
		categoryDao.save(category);
		ModelAndView mv=new ModelAndView("myproducts");
		return mv;
	 }
	/*@RequestMapping(value="/add/supplier", method=RequestMethod.POST)
	 public ModelAndView addSupplier(@ModelAttribute("supplier") Supplier supplier){
		supplierDao.save(supplier);
		ModelAndView mv=new ModelAndView("myproducts");
		return mv;
	 }	*/
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public ModelAndView viewDelete(){
		ModelAndView mv=new ModelAndView("delete","command",new Product());
		return mv;
}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	 public ModelAndView deleteProduct(HttpServletRequest request, HttpServletResponse response){
		int pid=Integer.parseInt(request.getParameter("id"));
		 		//Product product=productDao.delete(id);	
		 		productDao.delete(pid);
		 		ModelAndView mv=new ModelAndView("myproducts");
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
