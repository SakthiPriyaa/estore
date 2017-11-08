package com.nec.estore.backend.impl;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nec.estore.backend.dao.CartDao;
import com.nec.estore.backend.model.Cart;

@Repository
public class CartImpl implements CartDao{
	@Autowired
	private SessionFactory sessionFactory;
	/*private Map<String, Cart> listOfCarts;
	
	public CartImpl() {
		listOfCarts = new HashMap<String,Cart>();
	}

	public Cart create(Cart cart) {
		if(listOfCarts.keySet().contains(cart.getCartId())) {
			throw new IllegalArgumentException(String.format("Can not create a cart. A cart with the give id (%) aldrady exist",cart.getCartId()));
		}

		listOfCarts.put(cart.getCartId(), cart);
		return cart;
	}

	public Cart read(String cartId) {
		return listOfCarts.get(cartId);
	}

	public void update(String cartId, Cart cart) {
		if(!listOfCarts.keySet().contains(cartId)) {
			throw new IllegalArgumentException(String.format("Can not update cart. The cart with the give id (%) does not does not exist",cartId));
		}

		listOfCarts.put(cartId, cart);
		
	}

	public void delete(String cartId) {
		if(!listOfCarts.keySet().contains(cartId)) {
			throw new IllegalArgumentException(String.format("Can not delete cart. The cart with the give id (%) does not does not exist",cartId));
		}

		listOfCarts.remove(cartId);
		
	}

	public Cart validate(String cartId) {
		Cart cart = read(cartId);
		if(cart==null || cart.getCartItems().size()==0) {
			return null;
		} 
		
		return cart;
	}*/

	public Cart create(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(String cartId, Cart cart) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String cartId) {
		// TODO Auto-generated method stub
		
	}

	public Cart validate(String cartId) {
		// TODO Auto-generated method stub
		return null;
	}

}
