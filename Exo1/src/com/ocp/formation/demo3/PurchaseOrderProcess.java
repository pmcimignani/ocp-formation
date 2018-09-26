package com.ocp.formation.demo3;

import com.ocp.formation.demo2.OrderProduct;

public class PurchaseOrderProcess {

	public void sendOrderToProcess(OrderProduct orderProduct) {
		double totalPrice =  (orderProduct.getQuantity()* orderProduct.getPrice());
		System.out.println("Call Gain to Order:" + orderProduct +" for amount"+totalPrice);
	}

}
