package com.ocp.formation.demo3;

import com.ocp.formation.demo2.OrderProduct;
import com.ocp.formation.demo2.Product;

public class MainDemo3 {

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
		
		
		PurchaseOrderProcess po =new PurchaseOrderProcess() ;
		po.sendOrderToProcess(aspirineOrder);
	}

}
