package fr.ocp.legacy.formation.yoda.data;

public class YodaInput {
	private Long idProduct;
	private Long serialNumber;
	private String lots;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getLots() {
		return lots;
	}

	public void setLots(String lots) {
		this.lots = lots;
	}

	@Override
	public String toString() {
		return "YodaInput [idProduct=" + idProduct + ", serialNumber=" + serialNumber + ", lots=" + lots + "]";
	}

}
