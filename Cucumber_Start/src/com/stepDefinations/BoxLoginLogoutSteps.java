package com.stepDefinations;

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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BoxLoginLogoutSteps {

	WebDriver driver;
	
	@Given("^I navigate to Box app in firefox browser$")
	public void openFirefoxBrowser() throws Throwable {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.MAC);
		capabilities.setBrowserName("firefox");
		capabilities.setCapability(ForSeleniumServer.PROXYING_EVERYTHING, true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
		capabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		
		// objects and variables instantiation
		driver = new FirefoxDriver(capabilities);
		//WebDriver driver = new RemoteWebDriver(new URL("http://Dreambook.local:5555/wd/hub"), capabilities);

		String appUrl = "https://app.box.com/";

		// launch the firefox browser and open the application url
		driver.get(appUrl);

		// maximize the browser window
		driver.manage().window().maximize();
	}

	@Then("^Box Login page should open$")
	public void verifyBoxLoginPage() throws Throwable {

		// declare and initialize the variable to store the expected title of the webpage.
		String expectedTitle = "Box | Simple Online Collaboration";

		// fetch the title of the web page and save it into a string variable
		boolean titleFlag = new WebDriverWait(driver, 25).until(ExpectedConditions.titleIs(expectedTitle));
		Assert.assertTrue("Box Home Page is not displayed", titleFlag);
	
	}

	@Then("^login into the Box app$")
	public void loginInBox() throws Throwable {
	
		// enter a valid username in the email textbox
				WebElement username = driver.findElement(By.cssSelector("input[name=\"login\" ]"));
				username.clear();
				username.sendKeys("testappium@gmail.com");

				// enter a valid password in the password textbox
				WebElement password = driver.findElement(By.cssSelector("input[name=\"password\"]"));
				password.clear();
				password.sendKeys("police123");

				// click on the Sign in button
				WebElement SignInButton = driver.findElement(By.cssSelector("button[class=\"btn btn-primary btn-full-width\"]"));

				SignInButton.click();
	}

	@Then("^All Files page should open$")
	public void verifyAllFilesPage() throws Throwable {
				//***********************************
				boolean titleFlag = new WebDriverWait(driver, 20).until(ExpectedConditions.titleIs("All Files | Powered By Box"));
				//***********************************
				org.junit.Assert.assertTrue("Box All Files Page is not displayed", titleFlag);
//				String expectedTitle = "All files and folders - Box";
//
//				// fetch the title of the web page and save it into a string variable
//				String actualTitle = driver.getTitle();
//
//				// compare the expected title of the page with the actual title of the page and print the result
//
//				if (expectedTitle.equals(actualTitle))
//					System.out.println("Verification Successful - The correct title - \"All files and folders - Box\" is displayed on the web page.");
//				else
//					System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
	}

	@When("^I click on Box Logout link$")
	public void clickLogoutLink() throws Throwable {

		WebElement optionsDropdown = new WebDriverWait(driver, 70).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//div[@id='mod-header-amsterdam-1']/div[2]/div[2]/button")));

		optionsDropdown.click();
		Thread.sleep(2000);
		WebElement logoutLink = new WebDriverWait(driver, 70).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/logout\"]")));
		logoutLink.click();
		
		try {
			Thread.sleep(4000);
			//driver.quit();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Test script executed successfully.");
	}
}
