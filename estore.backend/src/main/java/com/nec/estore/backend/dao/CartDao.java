package com.nec.estore.backend.dao;

import com.nec.estore.backend.model.Cart;

public interface CartDao {
	
	Cart create(Cart cart);
	
	Cart read(String cartId);
	
	void update(String cartId, Cart cart);
	
	void delete(String cartId);
	
	Cart validate(String cartId);

}
