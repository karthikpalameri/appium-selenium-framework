package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utilities.BaseFunctions;
import utilities.Utilities;

public class GlobalVariablesAndObjects  {

	public static AndroidDriver<AndroidElement> driver;
	public static String propFileLocation = "/src/test/resources/global.properties";
	public static Utilities utilities = new Utilities(driver);

}
