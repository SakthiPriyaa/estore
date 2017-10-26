package com.nec.estore.backend.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nec.estore.backend.dao.CategoryDao;
import com.nec.estore.backend.model.Category;

@Repository
public class CategoryImpl implements CategoryDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	public void save(Category entity) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(int cid) {
		// TODO Auto-generated method stub
		
	}

	public void update(Category entity) {
		// TODO Auto-generated method stub
		
	}

	public Category findById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
