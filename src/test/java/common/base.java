package common;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilites() {
		AndroidDriver<AndroidElement> driver = null;
		File f = new File(System.getProperty("user.dir") + "/src/test/resources/ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 500000);
		try {
			System.out.println("Into creation of android driver..");
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4444/wd/hub"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}

}
