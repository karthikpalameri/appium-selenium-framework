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

public class TouchActionDemo extends base {

	public static void main(String[] args) {
		AndroidDriver<AndroidElement> driver = capabilites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
		// Tap
		TouchAction t = new TouchAction(driver);
		MobileElement ele = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
		t.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).perform();
//		t.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele)).withPosition(positionOption)
		MobileElement customAdapter=driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]");
		t.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();
		MobileElement peopleNames=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(peopleNames)).withDuration(Duration.ofMillis(15000))).release().perform();
		
		System.out.println(driver.getSessionId());
	}

}
