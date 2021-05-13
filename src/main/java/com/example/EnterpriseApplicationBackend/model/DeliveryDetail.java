package com.example.EnterpriseApplicationBackend.model;

public class DeliveryDetail {

	private int product_id;
	private int quantity;
	private int deliveryNote_id;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getDeliveryNote_id() {
		return deliveryNote_id;
	}

	public void setDeliveryNote_id(int deliveryNote_id) {
		this.deliveryNote_id = deliveryNote_id;
	}

	public int getQuantity() {
		return this.quantity;
	}

	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}