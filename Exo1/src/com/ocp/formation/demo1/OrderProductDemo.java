package com.ocp.formation.demo1;

public class OrderProductDemo {
	private int quantity;
	private double price;
	private String product;

	public OrderProductDemo() {
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity > 2000) {
			this.quantity = 1;
		} else {
			this.quantity = quantity;
		}
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

	public OrderProductDemo(int quantity, double price, String product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderProductDemo [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}

}
