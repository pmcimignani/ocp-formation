package com.ocp.formation.demo2;

public class Product {
	private String libelle;
	private String description;
	private int ref;
	
	public Product() {
	}
	public Product(int ref) {
		this.ref = ref;
	}
	public Product(String libelle) {
		this.libelle = libelle;
	}
	public Product(String libelle,String description) {
		this.libelle = libelle;
	}
	

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	@Override
	public String toString() {
		return "Product [libelle='" + libelle + "', ref=" + ref + "]";
	}

}
