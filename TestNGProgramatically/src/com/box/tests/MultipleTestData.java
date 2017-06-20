package com.box.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleTestData {

	@Test(dataProvider="data-provider")
	public void testCase1(String firstName, String lastName, String email ){
		System.out.println(firstName+"***"+lastName+"***"+email);
		System.out.println("");
	}
	
	@DataProvider(name ="data-provider")
	public Object[][] providesData(){
		
		Object[][] data =new Object[4][3];
		data[0][0] = "Anil";
		data[0][1] = "Sharma";
		data[0][2] ="anil@xyz.com";
		
		data[1][0] = "Vikas";
		data[1][1] = "Sood";
		data[1][2] ="vikas@xyz.com";
		
		data[2][0] = "Raman";
		data[2][1] = "Singla";
		data[2][2] ="raman@xyz.com";
		
		data[3][0] = "Gurdeep";
		data[3][1] = "Singh";
		data[3][2] ="gurdeep@xyz.com";
	
		return data;
	}
}
