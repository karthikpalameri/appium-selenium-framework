package driver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utilities.BaseFunctions;
import utilities.Utilities;

public class GlobalVariablesAndObjects {

	public static AndroidDriver<AndroidElement> mobileDriver;
	public static String propFileLocation = "/src/test/resources/global.properties";
	public static Utilities utilities = new Utilities(mobileDriver);
	public static ChromeDriver driver;
}
