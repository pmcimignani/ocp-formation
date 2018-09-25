package com.ocp.formation.demo2;

public class MainDemo2 {

	public static void main(String[] args) {
		//Create Aspirine instance
		Product aspirine = new Product();
		aspirine.setLibelle("Aspririne");
		aspirine.setRef("Ref-A");
		//Create Order
		OrderProduct aspirineOrder = new OrderProduct();
		aspirineOrder.setPrice(2.5);
		aspirineOrder.setQuantity(15);
		aspirineOrder.setProduct(aspirine);
		
		System.out.println(aspirineOrder);
	}

}
