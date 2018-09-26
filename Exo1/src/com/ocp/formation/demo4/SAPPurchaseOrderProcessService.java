package com.ocp.formation.demo4;

import com.ocp.formation.demo2.OrderProduct;

public class SAPPurchaseOrderProcessService implements PurchaseOrderProcessService {
	@Override
	public void sendOrderToProcess(OrderProduct aspirineOrder) {
		System.out.println("Call SAP to Order:" + aspirineOrder);
	}

	@Override
	public int getQuantity(OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		return 0;
	}
}
