package com.nec.SpecuBackend.Model;

import java.sql.Timestamp;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Job {
	@Id
	@GeneratedValue
	private int jid;
	private String jcontent;
	private Timestamp postedAt;
	private Timestamp modifiedAt;
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJcontent() {
		return jcontent;
	}
	public void setJcontent(String jcontent) {
		this.jcontent = jcontent;
	}
	public Timestamp getPostedAt() {
		return postedAt;
	}
	public void setPostedAt(Timestamp postedAt) {
		this.postedAt = postedAt;
	}
	public Timestamp getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
	

}
