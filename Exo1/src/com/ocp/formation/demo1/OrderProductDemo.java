package com.ocp.formation.demo1;

public class OrderProductDemo {
	int quantity;
	double price;
	String product;
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
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Order1 [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}
	
	
}
