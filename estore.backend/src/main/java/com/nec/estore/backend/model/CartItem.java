package com.nec.estore.backend.model;
import java.io.Serializable; 
//import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CartItems")
public class CartItem implements Serializable{
	private static final long serialVersionUID = -4045729241960416615L;

	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne
	private Product product;
	
	@Column(name = "cart_id")
	private int cartId;	
	
	@Column(name = "product_count")
	private int productCount;
	
	private double total;
	
	@Column(name = "buying_price")
	private double buyingPrice;
	
	@Column(name = "is_available")
	private boolean available = true;
	
	/*
	 * setter and getters for the above fields
	 * */
	
	public double getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/*@OneToOne
	private Product product;
	@Column(name="quantity")
	private int quantity;
	@Column(name="totalPrice")
	private BigDecimal totalPrice;
	
	public CartItem() {
		// TODO Auto-generated constructor stub
	}
	
	public CartItem(Product product) {
		super();
		this.product = product;
		this.quantity = 1;
		this.totalPrice = product.getUnitPrice();
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}*/
	/*public void updateTotalPrice() {
		totalPrice = this.product.getUnitPrice().multiply(new BigDecimal(this.quantity));
	}
	
	@Override
	public int hashCode() {
		final int prime = 311;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}*/
	
	

}
