package fr.ocp.formation.data;

/**
 * 
 * Class de representation des donnees de commandes Produits
 * 
 * @author pmc
 *
 */
public class POInput {
	/**
	 * identifiant produit dans Gain HQ
	 * 
	 */
	private int idProduct;
	/**
	 * Quantite commande par le client
	 */
	private int quantity;
	
	/**
	 * identifiant client dans icmd + Gain
	 */
	private String idCustomer;
	
	 public POInput() {
		// TODO Auto-generated constructor stub
	}
	 
	
	public POInput(int idProduct, int quantity, String idCustomer) {
		super();
		this.idProduct = idProduct;
		this.quantity = quantity;
		this.idCustomer = idCustomer;
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
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	@Override
	public String toString() {
		return "R2D2Input [idProduct=" + idProduct + ", quantity=" + quantity + ", idCustomer=" + idCustomer + "]";
	}
	
	
}
