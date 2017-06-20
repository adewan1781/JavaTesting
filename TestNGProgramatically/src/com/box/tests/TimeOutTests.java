package com.box.tests;

import org.testng.annotations.Test;

public class TimeOutTests {
	
	@Test
	public void firstTest() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("paused execution for 2 seconds");
	}
	
	@Test
	public void secondTest() throws InterruptedException{
		Thread.sleep(4000);
		System.out.println("paused execution for 4 seconds");
	}
	
	@Test(timeOut=3000)
	public void thirdTest() throws InterruptedException{
		Thread.sleep(4000);
		System.out.println("paused execution for 4 seconds");
	}
}
