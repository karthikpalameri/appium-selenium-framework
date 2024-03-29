package mobiletests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import driver.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import mobilePageObjects.homePage;
import utilities.BaseFunctions;
import utilities.Utilities;

public class ScrollDemo extends BaseFunctions {
	@Test
	public void scrollTEst() throws IOException {
		System.out.println("Test 1 start");
		AndroidDriver<AndroidElement> driver = capabilites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		homePage hp = new homePage(driver);

		utilities.scrollToText("Views");
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Views\"));");
		hp.views.click();

		System.out.println("clicked on Views");

		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		System.out.println("clicked on Date widgets");

		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		System.out.println("Clicked on Inline");

		// service.stop();

	}

	@Test
	public void test2Demo() {
		System.out.println("Test 2 start");
	}

}
