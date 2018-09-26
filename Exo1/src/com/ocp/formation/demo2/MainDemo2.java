package com.ocp.formation.demo2;

public class MainDemo2 {

	public static void main(String[] args) {
		Product viagra = new Product();
		viagra.setLibelle("Viagra Pour Abdel");
		viagra.setRef(434343434);
		
		Product viagra2 = new Product();
		viagra.setLibelle("Viagra Pour Abdel");
		viagra.setRef(434343434);
		
		OrderProduct viagraCommande = new OrderProduct();
		viagraCommande.setProduct(viagra);
		viagraCommande.setQuantity(1000);
		viagraCommande.setPrice(1);
		System.out.println(viagraCommande);

	}

}
