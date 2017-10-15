package com.nec.estore.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	@Id
	@GeneratedValue//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prod_id")
	private int id;
	@Column(name="prod_name")
	private String name;
	@Column(name="prod_desc")
	private String  desc;
	@Column(name="prod_stock")
	private int stock;
	@Column(name="prod_price")
	private float price;
	/*@ForeignKey(name="sup_id")
	private int s_id;*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
