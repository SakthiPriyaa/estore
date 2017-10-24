package com.nec.estore.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="Suppliers")
public class Supplier {
	@Id
	//@GeneratedValue//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sup_id")//,unique=true
	private String id;
	@Column(name="sup_name")
	private String name;
	@Column(name="sup_address")
	private String  desc;
	@Column(name="sup_email")
	private int stock;
	@Column(name="sup_contact")
	private float contact;
	/*@ForeignKey(name="prod_id")
	private String prod_id;*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getContact() {
		return contact;
	}
	public void setContact(float contact) {
		this.contact = contact;
	}

}
