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

public class LaunchingWIthAppPackageAndAppActivity extends base {

	public static void main(String[] args) {
		AndroidDriver<AndroidElement> driver = capabilites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Tap
		TouchAction t = new TouchAction(driver);
		MobileElement ele = driver.findElementById("com.android.calculator2:id/digit_9");
		t.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).perform();
//		
		System.out.println(driver.getSessionId());
	}

}
