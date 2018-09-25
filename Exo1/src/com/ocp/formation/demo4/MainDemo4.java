package com.ocp.formation.demo4;

import com.ocp.formation.demo2.OrderProduct;
import com.ocp.formation.demo2.Product;

public class MainDemo4 {

	public static void main(String[] args) {
		// Create Aspirine instance
		Product aspirine = new Product();
		aspirine.setLibelle("Aspririne");
		aspirine.setRef("Ref-A");
		// Create Order
		OrderProduct aspirineOrder = new OrderProduct();
		aspirineOrder.setPrice(2.5);
		aspirineOrder.setQuantity(15);
		aspirineOrder.setProduct(aspirine);

		PurchaseOrderProcessService poSAP = new SAPPurchaseOrderProcessService();
		poSAP.sendOrderToProcess(aspirineOrder);

		PurchaseOrderProcessService poGain = new GainPurchaseOrderProcessService();
		poGain.sendOrderToProcess(aspirineOrder);
	}

}
