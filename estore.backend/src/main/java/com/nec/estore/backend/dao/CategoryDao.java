package com.nec.estore.backend.dao;

import java.util.List;

import com.nec.estore.backend.model.Category;
import com.nec.estore.backend.model.Product;

public interface CategoryDao {
	
	public void save(Category entity);
	public void delete(int cid);
	public void update(Category entity);
	public Category findById(int cid);
	public List<Category> findAll();
}
