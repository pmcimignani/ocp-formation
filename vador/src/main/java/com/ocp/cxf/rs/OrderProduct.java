package com.ocp.cxf.rs;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderProduct {
	private String orderId;
	private String tarte;
	public String getTarte() {
		return tarte;
	}

	public void setTarte(String tarte) {
		this.tarte = tarte;
	}

	private String details;

	public OrderProduct() {
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "OrderProduct [orderId=" + orderId + "]";
	}

}
