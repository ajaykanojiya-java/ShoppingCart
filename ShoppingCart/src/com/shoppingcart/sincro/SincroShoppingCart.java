package com.shoppingcart.sincro;

import com.shoppingcart.business.Discount;
import com.shoppingcart.model.Customer;

public class SincroShoppingCart {
	
	public static Customer calculateBillAmount(Customer customer) {
		return Discount.updateBillAmount(customer);
	}

}
