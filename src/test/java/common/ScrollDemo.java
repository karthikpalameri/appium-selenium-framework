package common;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends base {

	public static void main(String[] args) {
		AndroidDriver<AndroidElement> driver = capabilites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println("clicked on Views");

		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		System.out.println("clicked on Date widgets");

		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		System.out.println("Clicked on Inline");
		
		
	}

}
