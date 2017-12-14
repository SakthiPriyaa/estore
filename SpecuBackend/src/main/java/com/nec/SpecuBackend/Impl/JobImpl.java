package com.nec.SpecuBackend.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.SpecuBackend.Dao.JobDao;
import com.nec.SpecuBackend.Model.Job;

@Repository("jobDao")
public class JobImpl implements JobDao{
	
	@Autowired
	SessionFactory sessionFactory;

	public JobImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdateJob(Job Job) {
		sessionFactory.getCurrentSession().saveOrUpdate(Job);

	}

	@Transactional
	public void deleteJob(int jid) {
		Job jobToDelete = new Job();
		jobToDelete.setJid(jid);
		sessionFactory.getCurrentSession().delete(jobToDelete);
	}

	@Transactional
	public Job getJob(int jid) {
		String hql = "from Job where jid=:jid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("jid",
				jid);
		List<Job> gotJob = query.getResultList();
		if (gotJob != null && !gotJob.isEmpty())
			return gotJob.get(0);
		return null;
	}

	@Transactional
	public List<Job> listJob() {
		String hql = "from Job";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Job> listOfJob = query.getResultList();
		return listOfJob;
	}


}
