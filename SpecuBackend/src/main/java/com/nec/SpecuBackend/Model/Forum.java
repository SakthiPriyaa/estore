package com.nec.SpecuBackend.Model;

import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Forum {

	@Id
	@GeneratedValue
	private int fid;
	private int uid;
	private String ftitle;
	private String fdescription;
	private Set<ForumPost> fposts;
	private Timestamp createdAt;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFtitle() {
		return ftitle;
	}
	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}
	public String getFdescription() {
		return fdescription;
	}
	public void setFdescription(String fdescription) {
		this.fdescription = fdescription;
	}
	public Set<ForumPost> getFposts() {
		return fposts;
	}
	public void setFposts(Set<ForumPost> fposts) {
		this.fposts = fposts;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
