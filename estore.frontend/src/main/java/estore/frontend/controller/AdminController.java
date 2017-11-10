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
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private ProductDao productDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private SupplierDao supplierDao;
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView showHome(){
		ModelAndView mv=new ModelAndView("redirect:stock");
		return mv;
	}
	
	
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
		product.setCid(category);
		product.setSid(supplier);
		productDao.save(product);
		ModelAndView mv=new ModelAndView("redirect:stock");
		return mv;
	 }
	
	
	
	
	
	@RequestMapping(value="/deleteproduct", method=RequestMethod.GET)
	public ModelAndView viewProductDelete(@RequestParam("id") int pid){
		ModelAndView mv=new ModelAndView("redirect:stock","command",new Product());
		productDao.delete(pid);
		mv.getModelMap().addAttribute("stock", productDao.findAll());
		return mv;
}
	
	
	
	
	
	@RequestMapping(value="/updateproduct", method=RequestMethod.GET)
	public ModelAndView viewUpdateProduct(Model model,@RequestParam("id") int pid){
		ModelAndView mv=new ModelAndView("update");
		Product product=productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		mv.getModelMap().addAttribute("categories", categoryDao.findAll());
		mv.getModelMap().addAttribute("supplier", supplierDao.findAll());
		return mv;
}
	
	@RequestMapping(value="/updateproduct", method=RequestMethod.POST)
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
		
	 }
	
			/*Category*/
	
	@RequestMapping(value="/addcategory", method=RequestMethod.GET)
	public ModelAndView viewAddCategory(){
		ModelAndView mv=new ModelAndView("add","command",new Category());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	@RequestMapping(value="/addcategory", method=RequestMethod.POST)
	 public ModelAndView addCategory(@ModelAttribute("category") Category category){
		categoryDao.save(category);
		ModelAndView mv=new ModelAndView("redirect:stock");
		return mv;
	 }
	@RequestMapping(value="/updatecategory", method=RequestMethod.GET)
	public ModelAndView viewUpdateCategory(Model model,@RequestParam("id") int cid){
		ModelAndView mv=new ModelAndView("update");
		Category category=categoryDao.findById(cid);
		mv.getModelMap().addAttribute("category", category);
		return mv;
}
	
	@RequestMapping(value="/updatecategory", method=RequestMethod.POST)
	// public ModelAndView updateProduct(@ModelAttribute("product") Product product){
	public ModelAndView updateCategory(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv=new ModelAndView("redirect:stock");
		Category category=new Category();
		category.setCid(Integer.parseInt(request.getParameter("cid")));
		category.setCname(request.getParameter("cname"));
		category.setCdesc(request.getParameter("cdesc"));
		categoryDao.update(category);
		mv.getModelMap().addAttribute("stock", categoryDao.findAll());
		return mv;
		
	 }
	@RequestMapping(value="/deletecategory", method=RequestMethod.GET)
	public ModelAndView viewCategoryDelete(@RequestParam("id") int cid){
		ModelAndView mv=new ModelAndView("redirect:stock","command",new Category());
		categoryDao.delete(cid);
		mv.getModelMap().addAttribute("stock", categoryDao.findAll());
		return mv;
}
	
			/*Supplier*/
	@RequestMapping(value="/stock" , method=RequestMethod.GET)
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
	
	@RequestMapping(value="/addsupplier", method=RequestMethod.GET)
	public ModelAndView viewAddSupplier(){
		ModelAndView mv=new ModelAndView("add","command",new Supplier());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
		
	@RequestMapping(value="/addsupplier", method=RequestMethod.POST)
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
	
	@RequestMapping(value="/updatesupplier", method=RequestMethod.GET)
	public ModelAndView viewUpdateSupplier(Model model,@RequestParam("id") int id){
		ModelAndView mv=new ModelAndView("update");
		Supplier supplier=supplierDao.findById(id);
		mv.getModelMap().addAttribute("suppliers", supplier);
		return mv;
	}
	
	@RequestMapping(value="/updatesupplier", method=RequestMethod.POST)
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
	
	@RequestMapping(value="/deletesupplier", method=RequestMethod.GET)
	public ModelAndView viewSupplierDelete(@RequestParam("id") int id){
		ModelAndView mv=new ModelAndView("redirect:stock","command",new Supplier());
		supplierDao.delete(id);
		mv.getModelMap().addAttribute("stock", supplierDao.findAll());
		return mv;
	}
	
	

}
