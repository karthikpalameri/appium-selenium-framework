package utilities;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.appium.java_client.service.local.flags.ServerArgument;

public class AppiumServerInitialization {

	public AppiumDriverLocalService appiumDriverLocalService;
	public AppiumServiceBuilder appiumServiceBuilder;
	public String node_js_path = "/usr/local/bin/node";
	public String appium_js_path = "/usr/local/lib/node_modules/appium/build/lib/main.js";

	public void startServer(int port) {
		appiumServiceBuilder = new AppiumServiceBuilder();
		appiumServiceBuilder.usingDriverExecutable(new File(node_js_path));
		appiumServiceBuilder.withAppiumJS(new File(appium_js_path));
		appiumServiceBuilder.withIPAddress("127.0.0.1");
//		appiumServiceBuilder.usingAnyFreePort();
		appiumServiceBuilder.usingPort(port);
		appiumServiceBuilder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		appiumServiceBuilder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
		appiumDriverLocalService = AppiumDriverLocalService.buildService(appiumServiceBuilder);
		try {
			appiumDriverLocalService.start();// start server
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void startAppiumInPort(int port) {
		if(!checkIfServerIsRunnning(port)) {
			
			startServer(port);
			stopServer();
			
		} else {
			System.out.println("Appium Server already running on Port - " + port);
		}
	}
	public void stopServer() {
		try {
			appiumDriverLocalService.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean checkIfServerIsRunnning(int port) {
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

}
