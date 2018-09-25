package com.ocp.formation.demo4;

import com.ocp.formation.demo2.OrderProduct;

public class GainPurchaseOrderProcessService implements PurchaseOrderProcessService {

	@Override
	public void sendOrderToProcess(OrderProduct aspirineOrder) {
		System.out.println("Call Gain to Order:" + aspirineOrder);
	}

}
