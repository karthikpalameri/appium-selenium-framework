 package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;

public class BaseFunctions extends base {
	int waitTime = 10;
	int pollingRate = 250;

	/*
	 * WAITS
	 */
	public void implicitlyWait() {
		// apply implicit wait to all
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public WebElement explicitlyWait(WebElement elem, int waitTime) {
		// apply explicitly wait to 1 elem
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.pollingEvery(Duration.ofMillis(pollingRate));
		return wait.until(ExpectedConditions.visibilityOf(elem));
	}

	public WebElement fluentWait(WebElement elem, int waitTime) {
		WebDriverWait wait = (WebDriverWait) new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(waitTime))
				.pollingEvery(Duration.ofMillis(pollingRate)).ignoring(NoSuchElementException.class);
		return wait.until(ExpectedConditions.visibilityOf(elem));

	}
	/*
	 * WAITS-END
	 */

	public void clickOnElement(WebElement elem, int waitTime) {
		explicitlyWait(elem, waitTime).click();
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)"); // This will scroll down the page by 1000 pixel vertical

	}
	
	
	public void scrollDownTillBottom() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // This will scroll down the page to the exact bottom

	}
	

	public void scrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(1000,0)"); // This will scroll up the page by 1000 pixel vertical

	}

	public void scrollIntoView(MobileElement ele) {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("ele[0].scrollIntoView();", ele); //This will scroll the page till the element is found		
		}

}
