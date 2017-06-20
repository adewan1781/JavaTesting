package com.box.tests;

import org.testng.annotations.Test;

public class TestNGException {
	
	@Test(expectedExceptions={ArithmeticException.class})
	public void testException(){
		
		int i = 5/0;
		System.out.println("value of i is infinity");
		
	}

}
