package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Utilities {
	AppiumDriver driver = null;

	public Utilities(AppiumDriver driver) {
		this.driver = driver;

	}

	public void scrollToText(String text) {
		AndroidDriver driver = (AndroidDriver) this.driver;
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
	}
}
