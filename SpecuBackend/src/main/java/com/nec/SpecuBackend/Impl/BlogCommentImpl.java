package com.nec.SpecuBackend.Impl;

import java.util.List; 

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.SpecuBackend.Dao.BlogCommentDao;
import com.nec.SpecuBackend.Model.BlogComment;

@Repository("blogCommentDAO")
public class BlogCommentImpl implements BlogCommentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public BlogCommentImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdateBlogComment(BlogComment blogComment) {
		sessionFactory.getCurrentSession().saveOrUpdate(blogComment);

	}

	@Transactional
	public void deleteBlogComment(int bcid) {
		BlogComment blogCommentToDelete = new BlogComment();
		blogCommentToDelete.setBcid(bcid);
		sessionFactory.getCurrentSession().delete(blogCommentToDelete);

	}

	@Transactional
	public BlogComment getBlogComment(int bcid) {
		String hql = "from BlogComment where bcid=:bcid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("bcid", bcid);
		List<BlogComment> gotBlogComment = query.getResultList();
		if (gotBlogComment != null && !gotBlogComment.isEmpty())
			return gotBlogComment.get(0);
		return null;
	}

	@Transactional
	public List<BlogComment> listBlogComments() {
		String hql = "from BlogComment";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<BlogComment> listOfBlogComments = query.getResultList();
		return listOfBlogComments;
	}

	@Transactional
	public List<BlogComment> listBlogByCreatedAt(int bid) {
		String hql = "from BlogComment where blog.bid=:bid ORDER BY commentedAt DESC ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("bid", bid);
		List<BlogComment> listOfBlogComments = query.getResultList();
		return listOfBlogComments;
	}

}
