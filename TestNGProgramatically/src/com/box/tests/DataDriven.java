package com.box.tests;

import org.testng.annotations.DataProvider;

public class DataDriven {

	@DataProvider(name ="data-provider")
	public static Object[][] providesData(){
		return new Object[][]
		{
			{"first set of data2"},
			{"second set of data2"},
			{"third set of data2"}
		};
	}
}
