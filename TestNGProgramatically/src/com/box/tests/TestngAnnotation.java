package com.box.tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestngAnnotation {
	
	@BeforeGroups(groups={"firstrgroup"})
	public void beforeGroup1(){
		 System.out.println("before firstrgroup");
	}
	
	@AfterGroups(groups={"firstrgroup"})
	public void afterGroup1(){
		System.out.println("after firstrgroup");
	}
	
   // test case 1
   @Test(groups={"firstrgroup"})
   public void testCase1() {
      System.out.println("in test case 1");
   }

   // test case 2
   @Test(groups={"firstrgroup"},enabled=false)
   public void testCase2() {
      System.out.println("in test case 2");
   }
   
   @Test(groups={"secondgroup"})
   public void testCase3() {
      System.out.println("in test case 3");
   }
   
   @Test(groups={"secondgroup"})
   public void testCase4() {
      System.out.println("in test case 4");
   }

   @BeforeMethod
   public void beforeMethod() {
      System.out.println("in beforeMethod");
   }

   @AfterMethod
   public void afterMethod() {
      System.out.println("in afterMethod");
   }

   @BeforeClass
   public void beforeClass() {
      System.out.println("in beforeClass");
   }

   @AfterClass
   public void afterClass() {
      System.out.println("in afterClass");
   }

   @BeforeTest
   public void beforeTest() {
      System.out.println("in beforeTest");
   }

   @AfterTest
   public void afterTest() {
      System.out.println("in afterTest");
      System.out.println(" ");
      
   }

   @BeforeSuite
   public void beforeSuite() {
      System.out.println("in beforeSuite");
   }

   @AfterSuite
   public void afterSuite() {
      System.out.println("in afterSuite");
   }

}
