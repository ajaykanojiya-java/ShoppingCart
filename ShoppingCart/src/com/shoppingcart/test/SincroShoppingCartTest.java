package com.shoppingcart.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import com.shoppingcart.model.Customer;
import com.shoppingcart.model.CustomerType;
import com.shoppingcart.sincro.SincroShoppingCart;

class SincroShoppingCartTest {
	
	@Test
	void testCalculateBillAmount() {
	
		Customer regular1 = new Customer("Regular Customer1",CustomerType.REGULAR, 5000);
		Customer regular2 = new Customer("Regular Customer2",CustomerType.REGULAR, 10000);
		Customer regular3 = new Customer("Regular Customer3",CustomerType.REGULAR, 15000);
		Customer premium1 = new Customer("Premium Customer1",CustomerType.PREMIUM, 4000);
		Customer premium2 = new Customer("Premium Customer2",CustomerType.PREMIUM, 8000);
		Customer premium3 = new Customer("Premium Customer3",CustomerType.PREMIUM, 12000);
		Customer premium4 = new Customer("Premium Customer4",CustomerType.PREMIUM, 20000);
		
		
		assertEquals(5000,(int) SincroShoppingCart.calculateBillAmount(regular1).getBillAmount());
		assertEquals(9500,(int) SincroShoppingCart.calculateBillAmount(regular2).getBillAmount());
		assertEquals(13500,(int) SincroShoppingCart.calculateBillAmount(regular3).getBillAmount());
		assertEquals(3600,(int) SincroShoppingCart.calculateBillAmount(premium1).getBillAmount());
		assertEquals(7000,(int) SincroShoppingCart.calculateBillAmount(premium2).getBillAmount());
		assertEquals(10200,(int) SincroShoppingCart.calculateBillAmount(premium3).getBillAmount());
		assertEquals(15800,(int) SincroShoppingCart.calculateBillAmount(premium4).getBillAmount());
	}

}
