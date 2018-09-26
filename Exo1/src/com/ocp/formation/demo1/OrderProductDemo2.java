package com.ocp.formation.demo1;

public class OrderProductDemo2 {

	public OrderProductDemo2() {
		OrderProductDemo orderProductDemoDoliprane = new OrderProductDemo(2,100.5,"Doliprane");
		String  product = orderProductDemoDoliprane.getProduct();
		orderProductDemoDoliprane.setProduct("Paracetamol");
		orderProductDemoDoliprane.setQuantity(100);
		orderProductDemoDoliprane.setPrice(0);
	}
	
}
