package com.nec.estore.backend.dao;

import java.util.List;

import com.nec.estore.backend.model.Cart;
import com.nec.estore.backend.model.CartItem;

public interface CartDao {
	
	/*Cart create(Cart cart);
	
	Cart read(String cartId);
	
	void update(String cartId, Cart cart);
	
	void delete(String cartId);
	
	Cart validate(String cartId);*/
	
	public List<CartItem> list(int cartId);
	public CartItem get(int id);	
	public void add(CartItem cartItem);
	public void update(CartItem cartItem);
	public void delete(CartItem cartItem);

	// fetch the CartLine based on cartId and productId
	public CartItem getByCartAndProduct(int cartId, int productId);		
		
	// updating the cart
	public void updateCart(Cart cart);
	
	// list of available cartLine
	public List<CartItem> listAvailable(int cartId);
	
	// adding order details
	//boolean addOrderDetail(OrderDetail orderDetail);
	

}
