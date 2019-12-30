package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Utilities {
	AppiumDriver driver = null;

	public Utilities(AppiumDriver driver) {
		this.driver = driver;

	}

	public void scrollToText(String text) {
		AndroidDriver driver = (AndroidDriver) this.driver;
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
	}

	public Properties loadProperty(String propFileLocation) throws IOException {
		// Properties code
		FileInputStream is = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(is);
		return prop;
	}
}
