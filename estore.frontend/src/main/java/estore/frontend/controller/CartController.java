package estore.frontend.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
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
	@Autowired
	private CartDao cartDao;
	
	@RequestMapping(value="/addToCart", method=RequestMethod.GET)
	public ModelAndView getProductById(Model model,@RequestParam("id") int pid) {
		ModelAndView mv=new ModelAndView("cart");
		Product product =productDao.findById(pid);
		mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	@RequestMapping(value="/addToCart", method=RequestMethod.POST)
	public ModelAndView getMyProductById(Model model,@RequestParam("id") int pid,HttpServletRequest request) {
		//ModelAndView mv=new ModelAndView("cart");
		Cart cart=new Cart();
		CartItem cart_item=new CartItem();
		//Cart cart=cartDao.getClass();
		//List<CartItem> cart=cartDao.listAvailable(pid);
		Product product =productDao.findById(pid);
		ModelAndView mv=null;
		/*if(product!=null){*/
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
									if(all_items.containsValue(cart_item) /*cartDao.listAvailable(id)*/){
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
					mv=new ModelAndView("/cart");

			}
			//session.setAttribute("name", customer.getName());
			//session.setAttribute("customer", customer);				
			/*}*/
		//return mv;
		//mv.getModelMap().addAttribute("product", product);
		return mv;
	}
	

}
