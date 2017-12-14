package com.nec.estore.backend.impl;

import java.util.List; 

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
		session.beginTransaction();
		session.delete(findById(pid));
		session.getTransaction().commit();
		session.close();
		
		
	}

	public void update(Product entity) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		session.close();
		
	}
	/*return (Product)sessionFactory.openSession().get(Product.class,pid);*/
	

	public Product findById(int pid) {
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.eq("pid",new Integer(pid)));
		List list=criteria.list();
		/*session.getTransaction().commit();
		session.close();*/
		if(!list.isEmpty()){
			return (Product)list.get(0);
		}else{
			return null;
		}
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
