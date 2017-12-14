package com.nec.SpecuBackend.Dao;

import java.util.List;

import com.nec.SpecuBackend.Model.Job;

public interface JobDao {
	
void saveOrUpdateJob(Job job);
	
	void deleteJob(int jid);
	
	Job getJob(int jid);
	
	List<Job> listJob();

}
