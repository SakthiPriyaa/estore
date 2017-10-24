package com.nec.estore.backend.impl;

import java.util.List;

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
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public void delete(int pid) {
		Session session=sessionFactory.openSession();
		String hql = "DELETE FROM Product P  "  + 
	             "WHERE P.id ='" + pid +"'" ;
		Query query = session.createQuery(hql);
		query.executeUpdate();
		session.getTransaction().commit();
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

	public Product findById(int pid) {
		return (Product)sessionFactory.openSession().get(Product.class,pid);
	}

	public List<Product> findAll() {
		Session session=sessionFactory.openSession();
		String hql = "FROM Product";
		Query query = session.createQuery(hql);
		List<Product> results =  query.list();
		System.out.println(results);
		//session.getTransaction().commit();
		return results;
		
	}

}
