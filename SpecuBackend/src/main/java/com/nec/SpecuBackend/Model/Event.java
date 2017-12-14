package com.nec.SpecuBackend.Model;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Event {
	@Id
	@GeneratedValue
	private int eid;
	private String econtent;
	private String eplace;
	private Timestamp eventAt;
	private Timestamp postedAt;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEcontent() {
		return econtent;
	}
	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}
	public String getEplace() {
		return eplace;
	}
	public void setEplace(String eplace) {
		this.eplace = eplace;
	}
	public Timestamp getEventAt() {
		return eventAt;
	}
	public void setEventAt(Timestamp eventAt) {
		this.eventAt = eventAt;
	}
	public Timestamp getPostedAt() {
		return postedAt;
	}
	public void setPostedAt(Timestamp postedAt) {
		this.postedAt = postedAt;
	}
	
	

}
