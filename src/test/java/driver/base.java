package driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {

	public static AppiumDriverLocalService service;



	public static AndroidDriver<AndroidElement> capabilites(String appName) throws IOException {
		AndroidDriver<AndroidElement> driver = null;

		// Properties code
		FileInputStream is = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(is);
		prop.get(appName);

		File appLoc = new File(System.getProperty("user.dir") + "/src/test/resources/" + prop.get(appName));

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, (String) prop.get("device"));
		cap.setCapability(MobileCapabilityType.APP, appLoc.getAbsolutePath());
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
