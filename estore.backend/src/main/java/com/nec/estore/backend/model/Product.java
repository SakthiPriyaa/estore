package com.nec.estore.backend.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.ForeignKey;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prod_id")//,unique=true
	private int pid;
	@ManyToOne(cascade=CascadeType.ALL)	
	private Supplier sid;//,unique=true
	@Column(name="prod_name")
	private String pname;
	@ManyToOne(cascade=CascadeType.ALL)
	private Category cat;
	@Column(name="prod_desc")
	private String  pdesc;
	@Column(name="prod_stock")
	private int pstock;
	@Column(name="prod_price")
	private float pprice;
	@Column(name="prod_img")
	private String pimg;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public Supplier getSid() {
		return sid;
	}
	public void setSid(Supplier sid) {
		this.sid = sid;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public int getPstock() {
		return pstock;
	}
	public void setPstock(int pstock) {
		this.pstock = pstock;
	}
	public float getPprice() {
		return pprice;
	}
	public void setPprice(float pprice) {
		this.pprice = pprice;
	}
	
	
	
	
	
	
	

}
