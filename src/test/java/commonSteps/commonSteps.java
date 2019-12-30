package commonSteps;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import utilities.AppiumServerInitialization;

public class commonSteps {

	@BeforeTest
	public void beforeClass() {
		System.out.println("Before class execution started");
		//AppiumServerInitialization as = new AppiumServerInitialization();
		//as.startServer(4723);
	}

	@AfterTest
	public void afterClass() {
		System.out.println("After class execution started");

	}

}
