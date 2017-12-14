package estore.frontend.controller;

import java.util.List; 
/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import com.nec.estore.backend.dao.CategoryDao;
import com.nec.estore.backend.dao.ProductDao;
//import com.nec.estore.backend.dao.SupplierDao;
//import com.nec.estore.backend.model.Category;
import com.nec.estore.backend.model.Product;
//import com.nec.estore.backend.model.Supplier;

@Controller

public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	

	@RequestMapping(value="/products" , method=RequestMethod.GET)
	public ModelAndView products() {
		ModelAndView mv=new ModelAndView ("products");
		List<Product> products=productDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		return mv;
	}
	@RequestMapping(value="/products" , method=RequestMethod.POST)
	public ModelAndView viewProducts() {
		ModelAndView mv=new ModelAndView ("products");
		List<Product> products=productDao.findAll();
		mv.getModelMap().addAttribute("products", products);
		return mv;
	}
	@RequestMapping(value="/prodesc", method=RequestMethod.GET)
	public ModelAndView getMyProductById(Model model,@RequestParam("id") int pid) {
		ModelAndView mv=new ModelAndView("prodesc");
		Product product =productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	/*@RequestMapping(value="/myproducts" , method=RequestMethod.GET)
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
	}*/
	
	/*Add Products*/
	
	/*@RequestMapping(value="/admin/addproduct", method=RequestMethod.GET)
	public ModelAndView viewAddProduct(){
		ModelAndView mv=new ModelAndView("add","command",new Product());
		mv.getModelMap().addAttribute("categories", categoryDao.findAll());
		mv.getModelMap().addAttribute("supplier", supplierDao.findAll());
		
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	@RequestMapping(value="/admin/addproduct", method=RequestMethod.POST)
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
		product.setCid(category);
		product.setSid(supplier);
		productDao.save(product);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }
	
	
	
	
	
	@RequestMapping(value="/admin/deleteproduct", method=RequestMethod.GET)
	public ModelAndView viewDelete(@RequestParam("id") int pid){
		ModelAndView mv=new ModelAndView("redirect:stock","command",new Product());
		productDao.delete(pid);
		mv.getModelMap().addAttribute("stock", productDao.findAll());
		return mv;
}
	
	
	
	
	
	@RequestMapping(value="/admin/updateproduct", method=RequestMethod.GET)
	public ModelAndView viewUpdateProduct(Model model,@RequestParam("id") int pid){
		ModelAndView mv=new ModelAndView("update");
		Product product=productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		mv.getModelMap().addAttribute("categories", categoryDao.findAll());
		mv.getModelMap().addAttribute("supplier", supplierDao.findAll());
		return mv;
}
	
	@RequestMapping(value="/admin/updateproduct", method=RequestMethod.POST)
	// public ModelAndView updateProduct(@ModelAttribute("product") Product product){
	public ModelAndView updateProduct(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv=new ModelAndView("redirect:stock");
		Category category=categoryDao.findById(Integer.parseInt(request.getParameter("cid")));
		Supplier supplier=supplierDao.findById(Integer.parseInt(request.getParameter("sid")));
		Product product =new Product();
		product.setPid(Integer.parseInt(request.getParameter("pid")));
		product.setPname(request.getParameter("pname"));
		product.setPstock(Integer.parseInt(request.getParameter("pstock")));
		product.setPdesc(request.getParameter("pdesc"));
		product.setPprice(Float.parseFloat(request.getParameter("pprice"))) ;
		product.setPimg(request.getParameter("pimg"));
		product.setCid(category);
		product.setSid(supplier);
		productDao.update(product);
		mv.getModelMap().addAttribute("stock", productDao.findAll());
		return mv;
		
	 }*/
	
	
	
	
	

}
