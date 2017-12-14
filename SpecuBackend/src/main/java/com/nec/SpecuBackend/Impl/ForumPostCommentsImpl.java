package com.nec.SpecuBackend.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.SpecuBackend.Dao.ForumPostCommentsDao;
import com.nec.SpecuBackend.Model.ForumPost;
import com.nec.SpecuBackend.Model.ForumPostComments;

@Repository("forumPostCommentsDAO")
public class ForumPostCommentsImpl implements ForumPostCommentsDao {
	@Autowired
	SessionFactory sessionFactory;

	public ForumPostCommentsImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdateForumPostComment(ForumPostComments forumPostComment) {
		sessionFactory.getCurrentSession().saveOrUpdate(forumPostComment);

	}

	@Transactional
	public void deleteForumPostComment(int fpcid) {
		ForumPostComments forumPostCommentTodelete = new ForumPostComments();
		forumPostCommentTodelete.setFpcid(fpcid);
		sessionFactory.getCurrentSession().delete(forumPostCommentTodelete);
	}

	@Transactional
	public ForumPostComments getForumPostComment(int fpcid) {
		String hql = "from ForumPostComments where fpcid=:fpcid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("fpcid",
				fpcid);
		List<ForumPostComments> gotForumPostComment = query.getResultList();
		if (gotForumPostComment != null && !gotForumPostComment.isEmpty())
			return gotForumPostComment.get(0);
		return null;
	}

	@Transactional
	public List<ForumPostComments> listForumPostComments() {
		String hql = "from ForumPostComments";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<ForumPostComments> listOfForumPostComments = query.getResultList();
		return listOfForumPostComments;
	}

	public void saveOrUpdateForumPostComment(ForumPost forumPostComment) {
		// TODO Auto-generated method stub
		
	}

}
