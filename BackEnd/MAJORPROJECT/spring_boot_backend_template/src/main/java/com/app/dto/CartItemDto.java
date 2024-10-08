package com.app.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.app.entities.Cart;
import com.app.entities.Product;

public class CartItemDto extends BaseDto{
	
    private Cart cart;
    private Product product;
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
	@Override
	public String toString() {
		return "CartItemDto [cart=" + cart + ", product=" + product + ", quantity=" + quantity + "]";
	}
	public CartItemDto(Cart cart, Product product, int quantity) {
		super();
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
	}
	public CartItemDto() {
		super();
	}
	
	

}
