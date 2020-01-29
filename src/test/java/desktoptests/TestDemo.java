package desktoptests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.Base;
import utilities.BaseFunctions;
import desktopPageObjects.*;

public class TestDemo extends BaseFunctions {

	@Test
	public void check() {
		System.out.println("Inside Test Now..");
		driver.get("https://mainspring.cognizant.com/");
		maximizeWindow();
		HomePage hp = new HomePage(driver);
		hp.userName.sendKeys("555127");
		hp.password.sendKeys("Jan@2020");
		clickOnElement(hp.logOnButton, 5);
		try {
			mouseOverElement(hp.topLeftMenu, 25, "hp.topLeftMenu");
			iPauseexecution(5000);
			clickUsingJavaScript(hp.viewMyProjeccts, "hp.viewMyProjeccts");
			iPauseexecution(5000);
		} catch (Exception e1) {
			System.out.println("Couldnt find time tracking so clicking using javascript click..");
			clickUsingJavaScript(hp.viewMyProjeccts, "hp.viewMyProjeccts");
		}

		try {

			mouseOverElement(hp.timeSheet, 20, "hp.timeSheet");
			mouseOverElementAndClick(hp.timeTracking, 20, "hp.timeTracking");
			iPauseexecution(5000);
		} catch (Exception e) {
			System.out.println("Couldnt find time tracking so clicking using javascript click..");
			clickUsingJavaScript(hp.timeTracking, "hp.timeTracking");
			explicitlyWait(hp.timesheetFor, 20);
		}

		String[] data = new String[] { "Ashwin Kumar S", "Mahitha G V", "H B Aishwarya Prakash", "Amani Rayala",
				"Karthik Palameri", "Kiran Kashimsetty Sridhar", "Yashwanth Kumar Kururu Basavaraju", "Manuja K J",
				"Pintu Yadav", "Pooja Bhandari", "Priya Ramachandran", "Udaya Vajapu", "Venkateswarlu Muttham",
				"Supriya Bhavani Cheni", "Lenin Kumar M", "Jaiganesh Radha", "Balaji Karunakaran", "Christopher Cruz",
				"Pushkar Sahu", "Radhika Kesaragere Iragappa", "Rajasekara Pandian Gnanasekara Pandian",
				"Surendar Sekaran", "Reddy Krishna G" };

//		ArrayList<String> myList = new ArrayList<String>();

		for (int p = 0; p < data.length; p++) {
			String x = data[p];
			try {
				switchToFrameId("contentframe");
				clickOnElement(hp.timesheetFor, 10);
				explicitlyWait(hp.ashwinKumarS, 10);

				String customXpath = "//span[@data-qtip='" + x + "']";
				clickOnElement(driver.findElement(By.xpath(customXpath)), 10);
				explicitlyWait(hp.notFiled, 10);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println();
				e1.printStackTrace();
			}

			for (int i = 2, j = 9; i <= 6; i++, j++) {
				try {
					String customXpathForRow = "// tr[@data-recordindex='" + i + "']";
					driver.findElement(By.xpath(customXpathForRow)).findElement(By.xpath("//td[" + j + "]//div//div"))
							.sendKeys("8");
				} catch (Exception e) {
					System.out.println("Row not present so moving forward..");
				}

			}
		}

	}

	@BeforeMethod
	public void beforeM() {
		System.out.println("Before Method execution started->");
		System.out.print("Driver Initializing in Before Method execution");
		Base.createChromeDriver();

	}

	@AfterMethod
	public void afterM() {
		System.out.println("After Method execution started->Driver CLosed");
		driver.quit();
	}

}
