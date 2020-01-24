package desktoptests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.Base;
import utilities.BaseFunctions;
import desktopPageObjects.*;
public class TestDemo extends BaseFunctions{

	@Test
	public void check() {
		System.out.println("Inside Test Now ");
		driver.get("https://mainspring.cognizant.com/");
		
		HomePage hp = new HomePage(driver);
		
		clickOnElement(hp.searchBar,2);
		
		
		
	}
	

	@BeforeMethod
	public void beforeM() {
		System.out.println("Before Method execution started");
		System.out.println("Driver Initializing in Before Method execution");
		Base.createChromeDriver();
		

	}

	@AfterMethod
	public void afterM() {
		System.out.println("After Method execution started");

	}

}
