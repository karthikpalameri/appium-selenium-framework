  package common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class LongPressDemo extends base {

	public static void main(String[] args) {
		try {
			AndroidDriver<AndroidElement> driver = capabilites();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
			driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			System.out.println("clicked on Views");

			driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
			System.out.println("clicked on Date widgets");

			driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
			System.out.println("Clicked on Inline");

			driver.findElementByXPath(
					"//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]").click();
			AndroidElement start = driver.findElementByXPath(
					"//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]");
			AndroidElement end = driver.findElementByXPath(
					"//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]");
			new TouchAction(driver).longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(start)))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).moveTo(ElementOption.element(end))
					.release().perform();
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}

	}
}
