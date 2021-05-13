package com.example.EnterpriseApplicationBackend.model;

public class SaleDetail {

	private Product product;
	private int quantity;
	private double price;
	private double total_value;

	public Product getProduct() {
		return this.product;
	}

	/**
	 * 
	 * @param product
	 */
	public void setProduct(Product product) {
		this.product = product;
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

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal_value() {
		return this.total_value;
	}

	/**
	 * 
	 * @param total_value
	 */
	public void setTotal_value(double total_value) {
		this.total_value = total_value;
	}

}