package com.nec.estore.backend.dao;

import java.util.List;

import com.nec.estore.backend.model.Cart;
import com.nec.estore.backend.model.CartItem;

public interface CartDao {
	void addItem(CartItem item);
	void deleteItem(int id);
	List<CartItem> getAllItems();
	CartItem getItemById(int id);
}
