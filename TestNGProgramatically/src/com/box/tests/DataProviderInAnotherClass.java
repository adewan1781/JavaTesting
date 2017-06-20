package com.box.tests;

import org.testng.annotations.Test;

public class DataProviderInAnotherClass {

	@Test(dataProvider="data-provider", dataProviderClass=DataDriven.class)
	public void testCase1(String param){
		System.out.println(param);
	}
}
