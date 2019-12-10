package common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.android.*;
public class Miscelleanous extends base {

	public static void main(String[] args) {
		try {
			AndroidDriver<AndroidElement> driver = capabilites();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println("Current activity:"+driver.currentActivity());
			System.out.println("Current activity:"+driver.getCurrentPackage());
			System.out.println("app context type :"+driver.getContext());
			System.out.println("orientation :"+driver.getOrientation());
			System.out.println("device locked state:"+driver.isDeviceLocked());
			driver.lockDevice();
			System.out.println(driver.isDeviceLocked());
			driver.navigate().back();
			driver.unlockDevice();
			System.out.println(driver.isDeviceLocked());
			
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}

	}
}
