package com.example.EnterpriseApplicationBackend.model;

import java.util.Date;

public class SaleInvoice {

	private int id;
	private Date date;
	private int customer_id;
	private int staff_id;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	public int getCustomer() {
		return this.customer_id;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer_id = customer_id;
	}

	public int getStaff() {
		return this.staff_id;
	}

	/**
	 * 
	 * @param staff
	 */
	public void setStaff(Staff staff) {
		this.staff_id = staff_id;
	}

}