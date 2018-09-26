package com.ocp.formation.demo4;

import com.ocp.formation.demo2.OrderProduct;

public interface PurchaseOrderProcessService {

	public  void sendOrderToProcess(OrderProduct aspirineOrder) ;
	
	public int getQuantity(OrderProduct orderProduct);

}
