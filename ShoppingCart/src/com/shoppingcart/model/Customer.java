package com.shoppingcart.model;

public class Customer {
	
	private String name;
	private CustomerType customerType;
	private double purchaseAmount;
	private double billAmount;
	
	public Customer() {
		
	}
	
	public Customer(String name, CustomerType customerType, double purchaseAmount) {
		this.name = name;
		this.customerType = customerType;
		this.purchaseAmount = purchaseAmount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	public double getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	
}
