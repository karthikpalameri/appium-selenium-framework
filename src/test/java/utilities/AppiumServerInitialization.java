package utilities;

import java.io.File;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.appium.java_client.service.local.flags.ServerArgument;

public class AppiumServerInitialization {

	public AppiumDriverLocalService appiumDriverLocalService;
	public AppiumServiceBuilder appiumServiceBuilder;
	public String node_js_path = "/usr/local/bin/node";
	public String appium_js_path = "/usr/local/lib/node_modules/appium/build/lib/main.js";

	@BeforeTest
	public void appiumInitialize() {
		appiumServiceBuilder = new AppiumServiceBuilder();
		appiumServiceBuilder.usingDriverExecutable(new File(node_js_path));
		appiumServiceBuilder.withAppiumJS(new File(appium_js_path));
		
		appiumServiceBuilder.withIPAddress("127.0.0.1");
//		appiumServiceBuilder.usingAnyFreePort();
		appiumServiceBuilder.usingPort(4444);
		appiumServiceBuilder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		appiumServiceBuilder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

		appiumDriverLocalService = AppiumDriverLocalService.buildService(appiumServiceBuilder);

		appiumDriverLocalService.start();// start server
	}

	@AfterTest
	public void stopServer() {
		
		try {
			appiumDriverLocalService.stop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
