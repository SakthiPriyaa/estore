package com.nec.estore.backend.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nec.estore.backend.dao.ProductDao;
import com.nec.estore.backend.model.Product;

@Repository
public class ProductImpl implements ProductDao{
	@Autowired
	private SessionFactory sessionFactory;
	public void save(Product entity) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public void delete(String id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		String hql = "DELETE FROM Product P  "  + 
	             "WHERE P.id ='" + id +"'" ;
		Query query = session.createQuery(hql);
		query.executeUpdate();
		session.close();
		
		
	}

	public void update(Product entity) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
	}

	public Product findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Product> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		String hql = "FROM Product";
		Query query = session.createQuery(hql);
		Set<Product> results = (Set<Product>) query.list();
		return results;
	}

}
