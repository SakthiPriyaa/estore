package com.nec.SpecuBackend.Model;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ForumPostComments {
	
	@Id
	@GeneratedValue
	private int fpcid;
	private int fpid;
	private int fid;
	private int uid;
	private String fpccontent;
	private Timestamp commentedAt;
	public int getFpcid() {
		return fpcid;
	}
	public void setFpcid(int fpcid) {
		this.fpcid = fpcid;
	}
	public int getFpid() {
		return fpid;
	}
	public void setFpid(int fpid) {
		this.fpid = fpid;
	}
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
	public String getFpccontent() {
		return fpccontent;
	}
	public void setFpccontent(String fpccontent) {
		this.fpccontent = fpccontent;
	}
	public Timestamp getCommentedAt() {
		return commentedAt;
	}
	public void setCommentedAt(Timestamp commentedAt) {
		this.commentedAt = commentedAt;
	}
	
	

}
