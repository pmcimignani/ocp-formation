package fr.ocp.formation.data;

public class PEInput {
	/**
	 * identifiant produit dans Gain HQ
	 * 
	 */
	private int idProduct;
	/**
	 * Quantite commande par le client
	 */
	private int quantity;

	public PEInput() {
	}
	
	public PEInput(int idProduct, int quantity) {
		super();
		this.idProduct = idProduct;
		this.quantity = quantity;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PEInput [idProduct=" + idProduct + ", quantity=" + quantity + "]";
	}

}
