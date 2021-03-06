package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

	public Properties loadProperty(String propFileLocation) {
		try {
			// Properties code
			FileInputStream is = new FileInputStream(
					System.getProperty("user.dir") + propFileLocation);
			Properties prop = new Properties();
			prop.load(is);
			return prop;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
