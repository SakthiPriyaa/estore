package com.nec.SpecuBackend.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.SpecuBackend.Dao.BlogDao;
import com.nec.SpecuBackend.Model.Blog;

@Repository("blogDAO")
public class BlogImpl implements BlogDao{
	
		@Autowired
		SessionFactory sessionFactory;
		
		public BlogImpl(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		@Transactional
		@Override
		public void saveOrUpdateBlog(Blog blog) {
			sessionFactory.getCurrentSession().saveOrUpdate(blog);

		}

		@Transactional
		@Override
		public void deleteBlog(int bid) {
			Blog blogTodelete = new Blog();
			blogTodelete.setBid(bid);
			sessionFactory.getCurrentSession().delete(blogTodelete);

		}

		@Transactional
		@Override
		public Blog getBlog(int bid) {
			String hql = "from Blog where bid=:blogId";
			Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("bid",bid);
			List<Blog> gotBlog = query.getResultList();
			if (gotBlog != null && !gotBlog.isEmpty())
				return gotBlog.get(0);
			return null;
		}

		@Transactional
		@Override
		public List<Blog> listBlogs() {
			String hql = "from Blog";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			List<Blog> listOfBlogs = query.getResultList();
			return listOfBlogs;
		}

		@Transactional
		@Override
		public List<Blog> listBlogsByCreatedAt(String status) {
			String hql = "from Blog  where status=:status ORDER BY createdAt desc";
			Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("status", status);
			List<Blog> listOfBlogs = query.getResultList();
			return listOfBlogs;
			
		}

	/*	@Transactional
		public List<Blog> listofPendingBlogs(char status){
			String hql ="from Blog where status=:status";
			Query query  = sessionFactory.getCurrentSession().createQuery(hql).setParameter("status", status);
			List<Blog> listOfBlogs = query.getResultList();
			return listOfBlogs;
		}*/
		
	

}
