package com.nec.SpecuBackend.Model;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ForumPost {
	
	@Id
	@GeneratedValue
	private int fpid;	
	private int uid;
	private String fpcontent;	
	private Timestamp postedAt;
	private Forum forum;
	
	
	public int getFpid() {
		return fpid;
	}
	public void setFpid(int fpid) {
		this.fpid = fpid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFpcontent() {
		return fpcontent;
	}
	public void setFpcontent(String fpcontent) {
		this.fpcontent = fpcontent;
	}
	public Timestamp getPostedAt() {
		return postedAt;
	}
	public void setPostedAt(Timestamp postedAt) {
		this.postedAt = postedAt;
	}
	public Forum getForum() {
		return forum;
	}
	public void setForum(Forum forum) {
		this.forum = forum;
	}
	
	

}
