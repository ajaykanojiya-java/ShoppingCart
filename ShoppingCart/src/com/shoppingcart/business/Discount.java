package com.shoppingcart.business;

import com.shoppingcart.model.Customer;
import com.shoppingcart.model.CustomerType;

public class Discount {
	
	private static double discount;
	
	//update the bill amount for customer
	public static Customer updateBillAmount(Customer customer) {
		customer.setBillAmount(customer.getPurchaseAmount() - getDiscountAmount(customer.getCustomerType(), customer.getPurchaseAmount()));
		return customer;
	}
	
	//get the discount amount
	private static double getDiscountAmount(CustomerType cutomerType, double amount) {
		
		switch(cutomerType) {
		
			case REGULAR:
				if(amount > 10000) {
					discount = (amount - 10000) * 0.2 + 500;	//$10,000 & above slab
				} else if(amount > 5000) {
					discount = (amount - 5000) * 0.1;			//$ 5,000 - $10,000 slab
				} else
					discount = 0;								//$0 - $ 5,000 slab
				break;
				
			case PREMIUM:
				if(amount > 12000) {
					discount = (amount - 12000) * 0.3 + 1800;	//$12,000 & above slab
				} else if(amount > 8000) {
					discount = (amount - 8000) * 0.2 + 1000;	//$8,000 - $ 12,000 slab
				} else if(amount > 4000) {
					discount = (amount - 4000) * 0.15 + 400;	//$4,000 - $ 8,000 slab
				}else
					discount = amount * 0.1;					//$0 - $ 4,000 slab
				break;
				
			default:
				discount = 0;
				
		}
		return discount;
	}

}
