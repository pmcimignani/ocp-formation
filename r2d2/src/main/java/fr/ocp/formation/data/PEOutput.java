package fr.ocp.formation.data;

public class PEOutput {

	private int returnCode;
	private int quantity;

	public int getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PEOutput [returnCode=" + returnCode + ", quantity=" + quantity + "]";
	}

}
