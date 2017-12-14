package com.nec.SpecuBackend.Model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Blog {
	@Id
	@GeneratedValue
	private int bid;
	private String bname;
	private String bcontent;	
	private int uid;
	private Timestamp createdAt;
	private String status;
	private Set<BlogComment> bcomments;
	private int views;
	private int likes;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<BlogComment> getBcomments() {
		return bcomments;
	}
	public void setBcomments(Set<BlogComment> bcomments) {
		this.bcomments = bcomments;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	

}
