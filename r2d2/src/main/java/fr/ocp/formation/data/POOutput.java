package fr.ocp.formation.data;

public class POOutput {

	private int returnCode;
	private double price;
	private String comment;
	
	public int getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "R2D2Output [returnCode=" + returnCode + ", price=" + price + ", comment=" + comment + "]";
	}

	
	
}
