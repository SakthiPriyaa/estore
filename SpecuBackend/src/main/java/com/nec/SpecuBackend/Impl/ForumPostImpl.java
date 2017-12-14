package com.nec.SpecuBackend.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.SpecuBackend.Dao.ForumPostDao;
import com.nec.SpecuBackend.Model.ForumPost;

@Repository("forumPostDAO")
public class ForumPostImpl implements ForumPostDao{
	
	@Autowired
	SessionFactory sessionFactory;

	public ForumPostImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdateForumPost(ForumPost forumPost) {
		sessionFactory.getCurrentSession().saveOrUpdate(forumPost);

	}

	@Transactional
	public void deleteForumPost(int fpid) {
		ForumPost forumPostToDelete = new ForumPost();
		forumPostToDelete.setFpid(fpid);
		sessionFactory.getCurrentSession().delete(forumPostToDelete);
	}

	@Transactional
	public ForumPost getForumPost(int fpid) {
		String hql = "from ForumPost where fpid=:fpid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("fpid",fpid);
		List<ForumPost> gotForumPost = query.getResultList();
		if(gotForumPost!=null&&!gotForumPost.isEmpty())
			return gotForumPost.get(0);
		return null;
	}

	@Transactional
	public List<ForumPost> listForumPosts() {
		String hql = "from ForumPost";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<ForumPost> listOfForumPost = query.getResultList();
		return listOfForumPost;
	}

}
