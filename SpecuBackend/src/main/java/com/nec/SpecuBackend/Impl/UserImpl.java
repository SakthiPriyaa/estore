package com.nec.SpecuBackend.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.SpecuBackend.Dao.UserDao;
import com.nec.SpecuBackend.Model.User;

@Repository("userDao")
public class UserImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;

/*	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	@Transactional
	public void saveOrUpdateUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Transactional
	public void deleteUser(String email) {
		User userToDelete = new User();
		userToDelete.setEmail(email);
		sessionFactory.getCurrentSession().delete(userToDelete);

	}

	@Transactional
	public User getUser(int uid) {
		String hql= "from User where uid=:uid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("uid",uid);
		List<User> gotUser=query.getResultList();
		if(gotUser!=null && !gotUser.isEmpty())
			return gotUser.get(0);
		return null;
	}

	public List<User> listUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public User checkUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
