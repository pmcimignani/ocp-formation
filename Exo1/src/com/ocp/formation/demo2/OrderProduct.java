package com.ocp.formation.demo2;

public class OrderProduct {
	private int quantity;
	private double price;
	private Product product;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "OrderProduct [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}

}
