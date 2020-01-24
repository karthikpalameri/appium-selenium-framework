package commonSteps;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

//import utilities.AppiumServerInitialization;

public class commonSteps {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test execution started");
		// AppiumServerInitialization as = new AppiumServerInitialization();
		// as.startServer(4723);
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test execution started");

	}



}
