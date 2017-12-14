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
	private SupplierDao supplierDao;
	@Autowired
	private CategoryDao categoryDao;
	
	/*Supplier Page-stock*/
		
	/*@RequestMapping(value="/stock" , method=RequestMethod.GET)
	public ModelAndView myProducts() {
		ModelAndView mv=new ModelAndView ("stock");
		List<Product> products=productDao.findAll();
		List<Category> categories=categoryDao.findAll();
		List<Supplier> suppliers=supplierDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		mv.getModelMap().addAttribute("categories", categories);
		mv.getModelMap().addAttribute("suppliers", suppliers);
		return mv;
	}
	*/
	
	/*@RequestMapping(value="/admin/stock" , method=RequestMethod.GET)
	public ModelAndView myStocks() {
		ModelAndView mv=new ModelAndView ("stock");
		List<Product> products=productDao.findAll();
		List<Category> categories=categoryDao.findAll();
		List<Supplier> suppliers=supplierDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		mv.getModelMap().addAttribute("categories", categories);
		mv.getModelMap().addAttribute("suppliers", suppliers);
		return mv;
	}
	
	
	
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView viewAdd(){
		ModelAndView mv=new ModelAndView("add");
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}	
	
	@RequestMapping(value="/admin/addsupplier", method=RequestMethod.GET)
	public ModelAndView viewAddSupplier(){
		ModelAndView mv=new ModelAndView("add","command",new Supplier());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
		
	@RequestMapping(value="/admin/addsupplier", method=RequestMethod.POST)
	 public ModelAndView addSupplier(@ModelAttribute("supplier") Supplier supplier){
		supplierDao.save(supplier);
		ModelAndView mv=new ModelAndView("redirect:stock");
		return mv;
	 }	
	
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public ModelAndView viewUpdate(){
		ModelAndView mv=new ModelAndView("update");
		return mv;
		
	}	
	
	@RequestMapping(value="/admin/updatesupplier", method=RequestMethod.GET)
	public ModelAndView viewUpdateSupplier(Model model,@RequestParam("id") int id){
		ModelAndView mv=new ModelAndView("update");
		Supplier supplier=supplierDao.findById(id);
		mv.getModelMap().addAttribute("suppliers", supplier);
		return mv;
	}
	
	@RequestMapping(value="/admin/updatesupplier", method=RequestMethod.POST)
	// public ModelAndView updateProduct(@ModelAttribute("product") Product product){
	public ModelAndView updateSupplier(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv=new ModelAndView("redirect:stock");
		Supplier supplier=new Supplier();
		supplier.setId(Integer.parseInt(request.getParameter("id")));
		supplier.setName(request.getParameter("name"));
		supplier.setEmail(request.getParameter("email"));
		supplier.setAddress(request.getParameter("address"));
		supplier.setContact(request.getParameter("contact"));
		supplierDao.update(supplier);
		mv.getModelMap().addAttribute("stock", supplierDao.findAll());
		return mv;
		
	 }
	
	@RequestMapping(value="/admin/deletesupplier", method=RequestMethod.GET)
	public ModelAndView viewDelete(@RequestParam("id") int id){
		ModelAndView mv=new ModelAndView("redirect:stock","command",new Supplier());
		supplierDao.delete(id);
		mv.getModelMap().addAttribute("stock", supplierDao.findAll());
		return mv;
	}*/
	
	
	
	


}
