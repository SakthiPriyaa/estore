package estore.frontend.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; 
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.CartDao;
import com.nec.estore.backend.dao.ProductDao;
import com.nec.estore.backend.model.Cart;
import com.nec.estore.backend.model.CartItem;
import com.nec.estore.backend.model.Product;

@Controller
public class CartController {
	@Autowired
	private ProductDao productDao;
/*	@Autowired
	private CartDao cartDao;*/
	
	@RequestMapping(value="/cart", method=RequestMethod.GET)
	public ModelAndView getCartItems(Model model,HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("cart");
		/*Cart cart = cartDao.listAvailable(cartId);
		int cartId=cart.getId();*/
		//String session=request.getSession().getId();
		/*cart =(Cart) cartDao.list(cartId);
		mv.getModelMap().addAttribute("cart", cart);*/
		return mv;
	}
	@RequestMapping(value="/custdetails", method=RequestMethod.GET)
	public ModelAndView getDetails(Model model,HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("custdetails");
	
		return mv;
	}
	
	@RequestMapping(value="/addToCart", method=RequestMethod.GET)
	public ModelAndView getProductById(Model model,@RequestParam("id") int pid, @RequestParam("txtQuantity") int quantity, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("redirect:products");
		Product product =productDao.findById(pid);
		int stock=product.getPstock();
		HttpSession session=request.getSession(false);
		Cart cart=null;
		if(session!=null){
			cart=(Cart) session.getAttribute("cart");
			CartItem item=new CartItem();
			item.setProduct(product);
			item.setQuantity(quantity);			
			if(cart==null){				
				cart=new Cart();	
			}
			boolean state=false;
			for(CartItem c : cart.getItems()){
				if(c.getProduct().getPname().equals(product.getPname())){
					
					product.setPstock(stock-item.getQuantity());
					if(product.getPstock()!=0) {
						c.setQuantity(item.getQuantity());
						state=true;
					}
					
				}
			}
			if(!state)
				cart.getItems().add(item);
		}	
		session.setAttribute("cart", cart);
		return mv;
	}
	@RequestMapping(value="/deleteitem", method=RequestMethod.GET)
	public ModelAndView getDeleteById(Model model,@RequestParam("id") int pid, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("redirect:cart");
		Product product =productDao.findById(pid);
		HttpSession session=request.getSession(false);
		Cart cart=null;
		if(session!=null){
			cart=(Cart) session.getAttribute("cart");
			CartItem item=new CartItem();
			/*List<CartItem> item= new ArrayList<CartItem>();
			Iterator<CartItem> it=item.iterator();
			while(it.hasNext()) {
				CartItem delItem=it.next();
				if(it.equals(product)) {
					cart.getItems().remove(delItem);
				}*/
			  
			try {
			for(CartItem c : cart.getItems()){
				if(c.getProduct().getPname().equals(product.getPname())){
					item=cart.getItems().set(c.getId(), c);
					cart.getItems().remove(item);					
				}
			}}catch(Exception e) {
				e.printStackTrace();
			}
		}
		//cart.getItems();	
		session.setAttribute("cart", cart);
		return mv;
	
	}
/*@RequestMapping(value="/updateCart", method=RequestMethod.GET)
public ModelAndView getItemById(Model model,@RequestParam("id") int pid, @RequestParam("txtQuantity") int quantity, HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv=new ModelAndView("redirect:products");
	Product product =productDao.findById(pid);
	mv.getModelMap().addAttribute("product", product);
	return mv;
}*/
}
	
	/*@RequestMapping(value="/updateCart", method=RequestMethod.POST)
	public ModelAndView getProductById(Model model,@RequestParam("id") int pid, @RequestParam("txtQuantity") int quantity, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("redirect:products");
		Product product =productDao.findById(pid);
		HttpSession session=request.getSession(false);
		Cart cart=null;
		if(session!=null){
			cart=(Cart) session.getAttribute("cart");
			CartItem item=new CartItem();
			item.setProduct(product);
			item.setQuantity(quantity);			
			if(cart==null){				
				cart=new Cart();	
			}
			boolean state=false;
			for(CartItem c : cart.getItems()){
				if(c.getProduct().getPname().equals(product.getPname())){
					c.setQuantity(item.getQuantity());
					state=true;
				}
			}
			if(!state)
			cart.getItems().add(item);
		}	
		session.setAttribute("cart", cart);
		return mv;
	}
}

	/*@RequestMapping(value="/addToCart", method=RequestMethod.POST)
	public ModelAndView getMyProductById(Model model,@RequestParam("id") int pid,HttpServletRequest request) {
		//ModelAndView mv=new ModelAndView("cart");
		Cart cart=new Cart();
		CartItem cart_item=new CartItem();
		//Cart cart=cartDao.getClass();
		//List<CartItem> cart=cartDao.listAvailable(pid);
		Product product =productDao.findById(pid);
		ModelAndView mv=null;
		if(product!=null){
			HttpSession session=request.getSession(false);
			if(session==null) {
				mv=new ModelAndView("/login");
			}
			else {
					if(cart.getCartItems()==null) {					
						int itemCount=Integer.parseInt(request.getParameter("itemCount"));
						double itemPrice=product.getPprice();
						double total=itemCount * itemPrice;
						cart_item.setProduct(product);
						cart_item.setItemCount(itemCount);
						cart_item.setItemPrice(itemPrice);
						cart_item.setTotal(total);
						cartDao.add(cart_item);					
					}
						else {
								int itemid=cart_item.getId();
								cart_item=cartDao.getByCartAndProduct(itemid, pid);
								Map<String,CartItem> all_items=cart.getCartItems();					
									if(all_items.containsValue(cart_item) cartDao.listAvailable(id)){
										int itemCount=Integer.parseInt(request.getParameter("itemCount"));
										double itemPrice=product.getPprice();
										double total=itemCount * itemPrice;
										cart_item.setId(itemid);
										cart_item.setProduct(product);
										cart_item.setItemCount(itemCount);
										cart_item.setItemPrice(itemPrice);
										cart_item.setTotal(total);
										cartDao.update(cart_item);	
										}
										else {
											int itemCount=Integer.parseInt(request.getParameter("itemCount"));
											double itemPrice=product.getPprice();
											double total=itemCount * itemPrice;
											cart_item.setProduct(product);
											cart_item.setItemCount(itemCount);
											cart_item.setItemPrice(itemPrice);
											cart_item.setTotal(total);
											cartDao.add(cart_item);
											}
					
							}
					session.setAttribute("cart", cart);
					mv=new ModelAndView("cart");

			}
			//session.setAttribute("name", customer.getName());
			//session.setAttribute("customer", customer);				
			}
		//return mv;
		//mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	*/
	


