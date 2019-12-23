package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import driver.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.homePage;
import utilities.Utilities;

public class ScrollDemo extends base {
	@Test
	public void scrollTEst() throws IOException {

		AndroidDriver<AndroidElement> driver = capabilites("androidTestApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		homePage hp = new homePage(driver);
		Utilities u = new Utilities(driver);

		u.scrollToText("Views");
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Views\"));");
		hp.views.click();

		System.out.println("clicked on Views");

		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		System.out.println("clicked on Date widgets");

		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		System.out.println("Clicked on Inline");
		
		//service.stop();

	}

}
