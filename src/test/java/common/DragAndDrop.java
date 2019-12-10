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
import io.appium.java_client.touch.offset.PointOption;

public class DragAndDrop extends base {

	public static void main(String[] args) {
		try {
			AndroidDriver<AndroidElement> driver = capabilites();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
			driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			System.out.println("clicked on Views");

			driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
			System.out.println("clicked on Date widgets");

			AndroidElement src = driver.findElementByXPath("//*[@resource-id='io.appium.android.apis:id/drag_dot_1']");
			AndroidElement dst = driver.findElementByXPath("//*[@resource-id='io.appium.android.apis:id/drag_dot_2']");
			new TouchAction(driver)
					.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(src)))
					.moveTo(ElementOption.element(dst)).release().perform();
			System.out.println("drag and drop completed");
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}

	}
}
