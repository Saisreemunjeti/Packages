package com.bank.customers;
public class Customer {
	private String customerName;
	private int customerID;
	public void setCustomerName(String customerName) {
	this.customerName=customerName;
	}
	public void setCustomerID(int customerID) {
	this.customerID=customerID;
	}
	public String getCustomerName() {
	return customerName;
	}
	public int getCustomerID() {
	return customerID;
	}
	public void showCustomerDetails() {
	System.out.println("Customer Name:"+customerName);
	System.out.println("Customer ID:"+customerID);
	}
	}

