package com.box.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType.ForSeleniumServer;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(description="BoxLoginLogout")
public class BoxLoginLogoutParameterised {
	BoxLoginLogoutParameterised bp;
	WebDriver driver;
	final String appUrl = "https://app.box.com/";
	
	String expectedTitle;
	String actualTitle ;
	
	   @BeforeSuite
	   public void beforeSuite() {
		   bp = new BoxLoginLogoutParameterised();
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setPlatform(Platform.MAC);
			capabilities.setBrowserName("chrome");
			capabilities.setCapability(ForSeleniumServer.PROXYING_EVERYTHING, true);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
			capabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
			
			// objects and variables instantiation
			driver = new ChromeDriver(capabilities);
			driver.get(appUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("driver created123");
	   }


	
	@Test
	 @Parameters({ "expectedTitle1"})
	public void verifyTitle1(String expectedTitle1) throws InterruptedException{
		new WebDriverWait(driver, 20).until(ExpectedConditions.titleIs(expectedTitle1));
		actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		if (expectedTitle1.equals(actualTitle))
			System.out.println("Verification Successful - The correct title - \""+expectedTitle1+"\" is displayed on the web page.");
		 else
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
	}
	
	
	@Test(dependsOnMethods={"verifyTitle1"})
	public void loginIntoBox(){
		// enter a valid username in the email textbox

		WebElement username = driver.findElement(By.name("login"));

		username.clear();

		username.sendKeys("testappium@gmail.com");

		// enter a valid password in the password textbox
		WebElement password = driver.findElement(By.name("password"));
		password.clear();

		password.sendKeys("police123");

		// click on the Sign in button

		WebElement signInButton = driver.findElement(By.cssSelector("button[class=\"btn btn-primary btn-full-width\"]"));

		signInButton.click();
	}

	@Test(dependsOnMethods={"loginIntoBox"})
	 @Parameters({ "expectedTitle2" })
	public void verifyTitle2(String expectedTitle2) throws InterruptedException{
		new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs(expectedTitle2));
		actualTitle = driver.getTitle();
		if(expectedTitle2.equals(actualTitle))
			System.out.println("Verification Successful - The correct title - \""+expectedTitle2+"\" is displayed on the web page.");
		else
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
	}
	
	@Test(dependsOnMethods={"verifyTitle2"})
	public void logoutFromBox() throws InterruptedException{
		WebElement optionsDropdown = new WebDriverWait(driver, 70).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//div[@id='mod-header-amsterdam-1']/div[2]/div[2]/button")));

		optionsDropdown.click();
		Thread.sleep(2000);
		WebElement logoutLink = new WebDriverWait(driver, 70).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/logout\"]")));
		logoutLink.click();

//		WebElement logoutLink = driver.findElement(By.linkText("Log Out"));
//		logoutLink.click();
	}

	   @AfterSuite
	   public void afterSuite() {
		   driver.quit();
			System.out.println("Test script executed successfully.");
	   }

}
