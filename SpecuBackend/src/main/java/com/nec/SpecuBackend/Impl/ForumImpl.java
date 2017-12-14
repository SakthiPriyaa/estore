package com.nec.SpecuBackend.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.SpecuBackend.Dao.ForumDao;
import com.nec.SpecuBackend.Model.Forum;


@Repository("forumDAO")
public class ForumImpl implements ForumDao{
	
	@Autowired
	SessionFactory sessionFactory;

	public ForumImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdateForum(Forum forum) {
		sessionFactory.getCurrentSession().saveOrUpdate(forum);

	}

	@Transactional
	public void deleteForum(int fid) {
		Forum forumToDelete = new Forum();
		forumToDelete.setFid(fid);
		sessionFactory.getCurrentSession().delete(forumToDelete);
	}

	@Transactional
	public Forum getForum(int fid) {
		String hql = "from Forum where fid=:fid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("fid", fid);
		List<Forum> gotForum = query.getResultList();
		if (gotForum != null && !gotForum.isEmpty())
			return gotForum.get(0);
		return null;
	}

	@Transactional
	public List<Forum> listForums() {
		String hql = "from Forum";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Forum> listOfForums = query.getResultList();
		return listOfForums;
	}
	
	@Transactional
	public List<Forum> listForumByCreatedAt(String status){
		String hql = "from Forum where status=:status order by createdAt desc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("status", status);
		List<Forum> listOfForums = query.getResultList();
		return listOfForums;
	}

}
