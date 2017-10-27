package estore.frontend.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.nec.estore.backend.dao.ProductDao;
import com.nec.estore.backend.dao.SupplierDao;
import com.nec.estore.backend.model.Product;
import com.nec.estore.backend.model.Supplier;

@Controller
public class SuppilerController{
	@Autowired
	private ProductDao productDao;
	@Autowired
	private SupplierDao supplierDao;
	
	/*Supplier Page-stock*/
		
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
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView viewAdd(){
		ModelAndView mv=new ModelAndView("add");
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}	
	
	@RequestMapping(value="/addsupplier", method=RequestMethod.GET)
	public ModelAndView viewAddSupplier(){
		ModelAndView mv=new ModelAndView("add","command",new Supplier());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
		
	@RequestMapping(value="/addsupplier", method=RequestMethod.POST)
	 public ModelAndView addSupplier(@ModelAttribute("supplier") Supplier supplier){
		supplierDao.save(supplier);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }	
	
	
	
	
	
	
	
	
	


}
