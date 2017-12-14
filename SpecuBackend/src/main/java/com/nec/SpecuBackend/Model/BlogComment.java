package com.nec.SpecuBackend.Model;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class BlogComment {
	@Id
	@GeneratedValue
	private int bcid;
	private String bccontent;
	private int uid;
	private Timestamp commentedAt;
	private Blog blog;
	public int getBcid() {
		return bcid;
	}
	public void setBcid(int bcid) {
		this.bcid = bcid;
	}
	public String getBccontent() {
		return bccontent;
	}
	public void setBccontent(String bccontent) {
		this.bccontent = bccontent;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Timestamp getCommentedAt() {
		return commentedAt;
	}
	public void setCommentedAt(Timestamp commentedAt) {
		this.commentedAt = commentedAt;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
	
}
