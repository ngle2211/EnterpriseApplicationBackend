package com.example.EnterpriseApplicationBackend.model;

public class OrderDetail {

	private int order_id;
	private int product_id;
	private int quantity;
	private double order_price;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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

	public double getOrder_price() {
		return this.order_price;
	}

	/**
	 * 
	 * @param order_price
	 */
	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}

}