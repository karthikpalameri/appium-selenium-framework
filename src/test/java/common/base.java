package common;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import driver.GlobalVariablesAndObjects;
import io.appium.java_client.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base extends GlobalVariablesAndObjects {
	static Properties prop = utilities.loadProperty(propFileLocation);

	public static AndroidDriver<AndroidElement> capabilites() {
		AndroidDriver<AndroidElement> driver = null;
		File f = new File(System.getProperty("user.dir") + "/src/test/resources/" + prop.get("androidTestApp"));

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "testdevice");
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
//		cap.setCapability("appPackage", "com.android.calculator2");
//		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 500000);
		try {
			System.out.println("Into creation of android driver..");
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4444/wd/hub"), cap);
		} catch (MalformedURLException e) {
			System.out.println("MalformedURL please check URL!");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Failed to create driver!!!");
			e.printStackTrace();
		}
		return driver;
	}



}
