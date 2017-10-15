package com.nec.estore.backend.dao;

import java.util.Set;

import com.nec.estore.backend.model.Customer;
import com.nec.estore.backend.model.Product;

public interface ProductDao {
	public void save(Product entity);
	public void delete(int id);
	public void update(Product entity);
	public Product findById(int id);
	public Set<Product> findAll();

}
