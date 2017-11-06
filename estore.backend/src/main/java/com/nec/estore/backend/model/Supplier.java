package com.nec.estore.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="Suppliers")
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sup_id")
	private int id;
	@Column(name="sup_name")
	private String name;
	@Column(name="sup_address")
	private String  address;
	@Column(name="sup_email")
	private String email;
	@Column(name="sup_contact")
	private String contact;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	

}
