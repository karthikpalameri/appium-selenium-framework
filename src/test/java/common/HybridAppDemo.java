package common;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HybridAppDemo extends base {

	public static void main(String[] args) {
		AndroidDriver<AndroidElement> driver = capabilites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println("clicked on Views");

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")
				.click();
		System.out.println("clicked on  WebView");

		Set<String> ch = driver.getContextHandles();// This will get all the contexts and save it in set

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (String c : ch) { // This for loop will print what are all the view available
			System.out.println(c);
			if (c.contains("WEBVIEW")) {// If it contains webview we will switch to webview context
				{
					System.out.println();
					System.out.println("Switching to webview");
					driver.context(c);
					System.out.println("Switched to webview");
				}
			}
		}

		driver.findElementByXPath("//*[starts-with(text(),'Hello')]").click();
		System.out.println("Clicked on Hello link");

		System.out.println("Switching back to nativeapp view");
		driver.context((String) ch.toArray()[0]);

		driver.navigate().back();
		System.out.println("clicked on back button ");
		
		/*
		 * difference between ios and android is 
		 * 1.swipe
		 * 2.Wheel picker - to select wheel you can send keys
		 */

	}

}
