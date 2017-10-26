package estore.frontend.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.CategoryDao;
import com.nec.estore.backend.dao.ProductDao;
import com.nec.estore.backend.dao.SupplierDao;
import com.nec.estore.backend.model.Category;
import com.nec.estore.backend.model.Product;
import com.nec.estore.backend.model.Supplier;

@Controller
public class SuppilerController{
	@Autowired
	private ProductDao productDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private SupplierDao supplierDao;
	
	@RequestMapping(value="/stock" , method=RequestMethod.GET)
	public ModelAndView myProducts() {
		ModelAndView mv=new ModelAndView ("stock");
		List<Product> products=productDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		return mv;
	}
	
	@RequestMapping(value="/stock" , method=RequestMethod.POST)
	public ModelAndView viewMyProducts() {
		ModelAndView mv=new ModelAndView ("stock");
		List<Product> products=productDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		return mv;
	}
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ModelAndView getProductById(Model model,@RequestParam("id") int pid) {
		ModelAndView mv=new ModelAndView("view");
		Product product =productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	/*@RequestMapping(value="/view", method=RequestMethod.POST)
	public ModelAndView viewProductById(Model model,@RequestParam("id") int pid) {
		ModelAndView mv=new ModelAndView("view");
		Product product =productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	*/
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView viewAdd(){
		ModelAndView mv=new ModelAndView("add");
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	
	
	
	
	@RequestMapping(value="/addproduct", method=RequestMethod.GET)
	public ModelAndView viewAddProduct(){
		ModelAndView mv=new ModelAndView("add","command",new Product());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	@RequestMapping(value="/addcategory", method=RequestMethod.GET)
	public ModelAndView viewAddCategory(){
		ModelAndView mv=new ModelAndView("add","command",new Category());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	@RequestMapping(value="/addsupplier", method=RequestMethod.GET)
	public ModelAndView viewAddSupplier(){
		ModelAndView mv=new ModelAndView("add","command",new Supplier());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	
	
	
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	 public ModelAndView addProduct(@ModelAttribute("product") Product product){
		productDao.save(product);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }
	
	@RequestMapping(value="/addcategory", method=RequestMethod.POST)
	 public ModelAndView addCategory(@ModelAttribute("category") Category category){
		categoryDao.save(category);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }
	@RequestMapping(value="/addsupplier", method=RequestMethod.POST)
	 public ModelAndView addSupplier(@ModelAttribute("supplier") Supplier supplier){
		supplierDao.save(supplier);
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
		int pid=Integer.parseInt(request.getParameter("id"));
		 		//Product product=productDao.delete(id);	
		 		productDao.delete(pid);
		 		ModelAndView mv=new ModelAndView("stock");
		 		return mv;
	 }
	
	
	
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public ModelAndView viewUpdate(){
		ModelAndView mv=new ModelAndView("update","command",new Product());
		return mv;
}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	 public ModelAndView updateProduct(@ModelAttribute("product") Product product){
		productDao.update(product);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }


}
