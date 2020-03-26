package desktoptests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.org.apache.xerces.internal.impl.dtd.models.DFAContentModel;

import driver.Base;
import utilities.BaseFunctions;
import desktopPageObjects.*;

public class TestDemo extends BaseFunctions {

	@Test
	public void fillAll() {
		System.out.println("Inside Test Now..");
		driver.get("https://mainspring.cognizant.com/");
		String parentWIndow = driver.getWindowHandle();
		maximizeWindow();
		HomePage hp = new HomePage(driver);
		hp.userName.sendKeys("555127");
		hp.password.sendKeys("");
		clickOnElement(hp.logOnButton, 5);
		try {
			iPauseexecution(2000);
			mouseOverElement(hp.topLeftMenu, 25, "hp.topLeftMenu");
			iPauseexecution(5000);
			clickOnElement(hp.comcastBSD, 10);
			iPauseexecution(5000);
		} catch (Exception e1) {
			System.out.println("Couldnt find comcastBSD so clicking using javascript click..");
			clickUsingJavaScript(hp.viewMyProjeccts, "hp.viewMyProjeccts");
		}

		try {

			mouseOverElement(hp.plan, 20, "hp.plan");
			mouseOverElementAndClick(hp.sprints, 20, "hp.sprints");
			explicitlyWait(hp.SPR, 20);
			iPauseexecution(5000);
		} catch (Exception e) {
			System.out.println("Couldnt find plan->sprints so clicking using javascript click..");
			clickUsingJavaScript(hp.sprints, "hp.sprints");
			explicitlyWait(hp.SPR, 20);
		}
		clickOnElement(hp.sprint213, 10);
		iPauseexecution(5000);
		switchToFrameId("contentframe");
		clickOnElement(hp.userStoryTab, 10);

		String[] data = new String[] { "Ashwin Kumar S", "Karthik Palameri", "Yashwanth Kumar Kururu Basavaraju",
				"Manuja K J", "Priya Ramachandran", "Venkateswarlu Muttham", "Supriya Bhavani Cheni", "Jaiganesh Radha",
				"Lenin Kumar M", "Balaji Karunakaran", "Pooja Bhandari", "Rahul Digambar Padalikar" };

		for (int i = 0; i < data.length; i++) {
			switchToFrameUsingName("eform_seg_9928178");
			System.out.println("i value is ->" + i);
			String beforeClickingWindowHandle = driver.getWindowHandle();
			clickOnElement(hp.userstoriesListElements.get(i), 10);
			iPauseexecution(5000);
			switchToPopedUpWindow(beforeClickingWindowHandle);
			clickOnElement(hp.toDos, 10);
//			switchToFrameId("10564943"); debug mado...
//			switchToFrameUsingIndex(2);
//			swit

			switchToFrameUsingName("eform_seg_10564943");

			for (int j = 0; j < hp.toDoGridTable_owner.size() - 1; j++) {
				clickOnElement(hp.toDoGridTable_owner.get(j), 10);
				selectDropDownByVisibleText(hp.selectBoxElement, data[i]);
				clickOnElement(hp.constantDummyClick.get(j), 10);
				clickOnElement(hp.eightText.get(j), 10);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys(Keys.BACK_SPACE);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys(Keys.BACK_SPACE);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys(Keys.BACK_SPACE);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys(Keys.BACK_SPACE);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys(Keys.BACK_SPACE);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys(Keys.BACK_SPACE);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys(Keys.BACK_SPACE);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys(Keys.BACK_SPACE);
				hp.eightText.get(j).findElement(By.xpath("./input")).sendKeys("8");
				clickOnElement(hp.constantDummyClick.get(j), 10);

			}

			if (hp.toDoGridTable_owner.size() > 5) {
				for (int j = hp.toDoGridTable_owner.size() - 1; j > 4; j--) {

					clickOnElement(hp.tickBoxes.get(j), 10);
					clickOnElement(hp.deleteTodo, 10);
				}
			}

			driver.switchTo().parentFrame();
			clickOnElement(hp.defenitionOfDone, 10);
			switchToFrameUsingName("eform_seg_13628824");

			iPauseexecution(3000);
			selectDropDownByIndex(hp.defOfDoneSelectBoxesList.get(0), 1);
			selectDropDownByIndex(hp.defOfDoneSelectBoxesList.get(1), 2);
			selectDropDownByIndex(hp.defOfDoneSelectBoxesList.get(2), 2);
			selectDropDownByIndex(hp.defOfDoneSelectBoxesList.get(3), 1);
			selectDropDownByIndex(hp.defOfDoneSelectBoxesList.get(4), 2);

			driver.switchTo().parentFrame();
			clickOnElement(hp.saveButton, 10);
			iPauseexecution(5000);
			driver.close();
			driver.switchTo().window(parentWIndow);
			switchToFrameId("contentframe");

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
