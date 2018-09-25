package com.ocp.formation.demo2;

public class Product {
	String libelle;
	String ref;
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	@Override
	public String toString() {
		return "Product [libelle=" + libelle + ", ref=" + ref + "]";
	}
	
	
}
