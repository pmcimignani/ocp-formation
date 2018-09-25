package com.ocp.formation.demo2;

public class OrderProduct {
	int quantity;
	double price;
	Product product;
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
		return "Order2 [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}
	
	
}
