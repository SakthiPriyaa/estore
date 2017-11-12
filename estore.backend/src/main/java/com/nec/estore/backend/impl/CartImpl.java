package com.nec.estore.backend.impl;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.estore.backend.dao.CartDao;
import com.nec.estore.backend.model.Cart;
import com.nec.estore.backend.model.CartItem;

@Repository
@Transactional
public class CartImpl implements CartDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<CartItem> list(int cartId) {
		/*String query = "FROM CartItem WHERE cartId = :cartId";
		return sessionFactory.getCurrentSession()
								.createQuery("from CartItem");
									.setParameter("cartId", cartId)
										.getResultList();	*/
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Query query=s.createQuery("from CartItem  WHERE cartId = :cartId");
		List<CartItem> list=query.list();
		System.out.println(list);
		s.getTransaction().commit();
		return list;
	}

	public CartItem get(int id) {
		return (CartItem)sessionFactory.openSession().get(CartItem.class,id);
	}

	public void add(CartItem entity) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(entity);
		s.getTransaction().commit();
		s.close();
		//return;
	}

	public void update(CartItem entity) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.saveOrUpdate(entity);
		s.getTransaction().commit();
		s.close();	
		//return true;
	}

	public void delete(CartItem cartLine) {
		sessionFactory.getCurrentSession().delete(cartLine);
		//return true;
	}

	public CartItem getByCartAndProduct(int cartId, int productId) {
		/*String query = "FROM CartItem WHERE cartId = :cartId AND product.pid= :productId";
		try {
			return sessionFactory.getCurrentSession()
									.createQuery(query, CartItem.class)
										.setParameter("cartId", cartId)
										.setParameter("productId", productId)
											.getSingleResult();	
			}
		catch(Exception ex) {
			return null;
		}*/
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Query query=s.createQuery("from CartItem  WHERE cartId = :cartId AND product.pid= :productId");
		List<CartItem> list=query.list();
		if(!list.isEmpty()) {
			return (CartItem)list.get(0);
		}else {
			return null;
		}
		/*System.out.println(list);
		s.getTransaction().commit();
		return list;*/
	}
  
	public void updateCart(Cart cart) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.saveOrUpdate(cart);
		s.getTransaction().commit();
		s.close();
		//return true;
	}

	public List<CartItem> listAvailable(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*private Map<String, Cart> listOfCarts;
	
	public CartImpl() {
		listOfCarts = new HashMap<String,Cart>();
	}

	public Cart create(Cart cart) {
		if(listOfCarts.keySet().contains(cart.getCartId())) {
			throw new IllegalArgumentException(String.format("Can not create a cart. A cart with the give id (%) aldrady exist",cart.getCartId()));
		}

		listOfCarts.put(cart.getCartId(), cart);
		return cart;
	}

	public Cart read(String cartId) {
		return listOfCarts.get(cartId);
	}

	public void update(String cartId, Cart cart) {
		if(!listOfCarts.keySet().contains(cartId)) {
			throw new IllegalArgumentException(String.format("Can not update cart. The cart with the give id (%) does not does not exist",cartId));
		}

		listOfCarts.put(cartId, cart);
		
	}

	public void delete(String cartId) {
		if(!listOfCarts.keySet().contains(cartId)) {
			throw new IllegalArgumentException(String.format("Can not delete cart. The cart with the give id (%) does not does not exist",cartId));
		}

		listOfCarts.remove(cartId);
		
	}

	public Cart validate(String cartId) {
		Cart cart = read(cartId);
		if(cart==null || cart.getCartItems().size()==0) {
			return null;
		} 
		
		return cart;
	}*/

	/*public Cart create(Cart entity) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(entity);
		s.getTransaction().commit();
		s.close();
		return entity;
	}

	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(String cartId, Cart cart) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String cartId) {
		// TODO Auto-generated method stub
		
	}

	public Cart validate(String cartId) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
