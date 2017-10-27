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
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private SupplierDao supplierDao;

	@RequestMapping(value="/products" , method=RequestMethod.GET)
	public ModelAndView products() {
		ModelAndView mv=new ModelAndView ("products");
		List<Product> products=productDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		return mv;
	}
	@RequestMapping(value="/prodesc", method=RequestMethod.GET)
	public ModelAndView getMyProductById(Model model,@RequestParam("pid") int pid) {
		ModelAndView mv=new ModelAndView("prodesc");
		Product product =productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	@RequestMapping(value="/myproducts" , method=RequestMethod.GET)
	public ModelAndView myProducts() {
		ModelAndView mv=new ModelAndView ("myproducts");
		List<Product> products=productDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		return mv;
	}
	
	@RequestMapping(value="/myproducts" , method=RequestMethod.POST)
	public ModelAndView viewMyProducts() {
		ModelAndView mv=new ModelAndView ("myproducts");
		List<Product> products=productDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		return mv;
	}
	@RequestMapping(value="/myprodesc", method=RequestMethod.GET)
	public ModelAndView getProductById(Model model,@RequestParam("id") int pid) {
		ModelAndView mv=new ModelAndView("myprodesc");
		Product product =productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	
	/*Add Products*/
	
	@RequestMapping(value="/addproduct", method=RequestMethod.GET)
	public ModelAndView viewAddProduct(){
		ModelAndView mv=new ModelAndView("add","command",new Product());
		mv.getModelMap().addAttribute("categories", categoryDao.findAll());
		mv.getModelMap().addAttribute("supplier", supplierDao.findAll());
		
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	// public ModelAndView addProduct(@ModelAttribute("product") Product product, HttpServletRequest request){
	 public ModelAndView addProduct(HttpServletRequest request, HttpServletResponse response){
		Category category=categoryDao.findById(Integer.parseInt(request.getParameter("cid")));
		Supplier supplier=supplierDao.findById(Integer.parseInt(request.getParameter("sid")));
		Product product =new Product();
		product.setPname(request.getParameter("pname"));
		product.setPstock(Integer.parseInt(request.getParameter("pstock")));
		product.setPdesc(request.getParameter("pdesc"));
		product.setPprice(Float.parseFloat(request.getParameter("pprice"))) ;
		product.setPimg(request.getParameter("pimg"));
		product.setCat(category);
		product.setSid(supplier);
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
