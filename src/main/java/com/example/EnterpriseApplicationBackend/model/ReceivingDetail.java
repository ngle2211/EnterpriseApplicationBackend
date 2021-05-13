package com.example.EnterpriseApplicationBackend.model;

public class ReceivingDetail {

	private int product_id;
	private int quantity;
	private int receiveNote_id;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getReceiveNote_id() {
		return receiveNote_id;
	}

	public void setReceiveNote_id(int receiveNote_id) {
		this.receiveNote_id = receiveNote_id;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}