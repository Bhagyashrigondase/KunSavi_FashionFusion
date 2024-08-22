package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_items")
public class CartItems extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name="cart_id", nullable = false)
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name="product_id",nullable = false)
	private Product product;
	
	@Column(nullable = false)
	private int quantity;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
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

	public CartItems(Cart cart, Product product, int quantity) {
		super();
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
	}

	public CartItems() {
		super();
	}

	@Override
	public String toString() {
		return "CartItems [cart=" + cart + ", product=" + product + ", quantity=" + quantity + "]";
	}
	
	

}
