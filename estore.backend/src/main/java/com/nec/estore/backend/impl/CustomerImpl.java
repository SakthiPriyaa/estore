package com.nec.estore.backend.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.nec.estore.backend.dao.CustomerDao;
import com.nec.estore.backend.model.Customer;


@Repository
public class CustomerImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	public void save(Customer entity) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
