package com.nec.estore.backend.dao;

import java.util.List;



import com.nec.estore.backend.model.Product;

public interface ProductDao {
	public void save(Product entity);
	public void delete(int pid);
	public void update(Product entity);
	public Product findById(int pid);
	public List<Product> findAll();
	//public void delete(String id);

}
