package common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class AndroidUiAutomator extends base {

	public static void main(String[] args) {
		AndroidDriver<AndroidElement> driver = capabilites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findelementByAndroidUIAutomator("attribute("value")");

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		// property if you want to check that attribute use
		// driver.findElementByAndroidUIAutomator("new UiSelector().property(value)");
		System.out.println("Size of elements having clickable as True:"
				+ driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

		
		System.out.println(driver.getSessionId());
	}

}
