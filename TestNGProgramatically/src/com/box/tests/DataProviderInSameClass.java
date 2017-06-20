package com.box.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSameClass {
	
	@Test(dataProvider="data-provider")
	public void testCase1(String param){
		System.out.println(param);
	}
	
	@DataProvider(name ="data-provider")
	public Object[][] providesData(){
		return new Object[][]
		{
			{"first set of data"},
			{"second set of data"},
			{"third set of data"}
		};
	}

}
