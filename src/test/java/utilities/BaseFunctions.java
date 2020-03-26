package utilities;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
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
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.pollingEvery(Duration.ofMillis(pollingRate));
			return wait.until(ExpectedConditions.visibilityOf(elem));
		} catch (Exception e) {
			System.out.println("Failed waiting for an element");
			e.printStackTrace();
		}
		return elem;
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

	public void mouseOverElement(WebElement topLeftMenu, int waitTime, String elementName) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(explicitlyWait(topLeftMenu, waitTime)).perform();
		} catch (Exception e) {
			System.out.println("Mouse over to element failed for element " + elementName);
			e.printStackTrace();
		}

	}

	public void mouseOverElementAndClick(WebElement topLeftMenu, int waitTime, String elementName) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(explicitlyWait(topLeftMenu, waitTime)).click().perform();
		} catch (Exception e) {
			System.out
					.println("Mouse overing to element " + elementName + " and clicking on " + elementName + " failed");
			e.printStackTrace();
		}

	}

	public void clickUsingJavaScript(WebElement ele, String elementName) {

		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
		} catch (Exception e) {
			System.out.println("Failed to click with JavaScriptExecutor on element " + elementName);
			e.printStackTrace();
		}
	}

	public void iPauseexecution(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// iframe switch
	public void switchToFrameId(String id) {
		try {
			driver.switchTo().frame(id);
			System.out.println("Switch to frame id ->" + id);
		} catch (Exception e) {
			System.out.println("Failed to switch to frame id ..");
			e.printStackTrace();
		}
	}

	public void switchToFrameUsingIndex(int index) {
		try {
			driver.switchTo().frame((driver.findElements(By.tagName("iframe")).get(index - 1)));
		} catch (Exception e) {
			System.out.println("Failed to switch to frame using inxdex.." + index);
			e.printStackTrace();
		}
	}

	public void switchToFrameUsingName(String frameNameAttributeValue) {
		try {
			driver.switchTo().frame(frameNameAttributeValue);
		} catch (Exception e) {
			System.out.println("Failed to switch to frame using frameNameAttributeValue.." + frameNameAttributeValue);
			e.printStackTrace();
		}
	}

	public void switchToParentWindow() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("Failed to switch to defaultContent..");
			e.printStackTrace();
		}
	}

	//
	// Alert Handling

	public void acceptAlert() {

		try {
			Alert a = driver.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			System.out.println("Failed to accept alert..");
			e.printStackTrace();
		}

	}

	public void dismissAlert() {

		try {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		} catch (Exception e) {
			System.out.println("Failed to dismiss alert..");
			e.printStackTrace();
		}

	}

	public String getTextOfAlert() {
		String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
		} catch (Exception e) {
			System.out.println("Failed to get text of alert..");
			e.printStackTrace();
		}

		return alertText;

	}

	// Screenshot
	public String takeScreenShot(String destinationPathLocation, String fileName) {
		try {
			String exactPath = destinationPathLocation + fileName;
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(exactPath));
		} catch (Exception e) {
			System.out.println(
					"Failed to get the screenshot for " + fileName + " in location " + destinationPathLocation);
			e.printStackTrace();
		}
		return null;

	}

	public void switchToWindow(String popUpTitle) {
		try {
			String currentWindow = driver.getWindowHandle();
			WebDriver popUp = null;
			Set<String> allWindows = driver.getWindowHandles();
			Iterator<String> itr = allWindows.iterator();
			while (itr.hasNext()) {
				popUp = driver.switchTo().window(itr.next());
				if (popUp.getTitle().equalsIgnoreCase(popUpTitle)) {
					System.out.println(popUpTitle + " Title found And Switched to it Succesfully");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Failed to switch to window");
			e.printStackTrace();
		}

	}

	// pending
	public void switchToPopedUpWindow(String beforeClickingWindowHandle) {
		try {
			String mainWindow = beforeClickingWindowHandle;
			// WebDriver popUp = null;
			Set<String> allWindows = driver.getWindowHandles();
			Iterator<String> itr = allWindows.iterator();
			while (itr.hasNext()) {
				String ChildWindow = itr.next().toString();

				if (!mainWindow.equals(ChildWindow)) {
					driver.switchTo().window(ChildWindow);
					System.out.println("Switched to popUp window. Title is->" + driver.getTitle());
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Failed to switch to window");
			e.printStackTrace();
		}

	}

	public String getCssPropertyValue(WebElement ele, String propertyName) {
		try {
			return ele.getCssValue(propertyName);
		} catch (Exception e) {
			System.out.println("Error in getting the css value for " + propertyName);
			e.printStackTrace();
		}
		return null;

	}

	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)"); // This will scroll down the page by 1000 pixel vertical

	}

	public void scrollDownTillBottom() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // This will scroll down the page to the
																			// exact bottom

	}

	public void scrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(1000,0)"); // This will scroll up the page by 1000 pixel vertical

	}

	public void scrollIntoView(WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("ele[0].scrollIntoView();", ele); // This will scroll the page till the element is found
	}

	public void selectDropDownByVisibleText(WebElement ele, String visibleText) {
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(visibleText);
			System.out.println("Selected " + visibleText + " from the dropdown");
		} catch (Exception e) {
			System.out.println("Exception in selecting " + visibleText + " from the dropdown");
			e.printStackTrace();
		}
	}

	public void selectDropDownByValueAttribute(WebElement ele, String htmlValueAttributeValue) {
		try {
			Select s = new Select(ele);
			s.selectByValue(htmlValueAttributeValue);
		} catch (Exception e) {
			System.out.println(
					"Exception in selecting  html value atttribute " + htmlValueAttributeValue + " from the dropdown");
			e.printStackTrace();
		}
	}

	public void selectDropDownByIndex(WebElement ele, int index) {
		try {
			Select s = new Select(ele);
			s.selectByIndex(index);
		} catch (Exception e) {
			System.out.println("Exception in selecting  " + index + " st value from the dropdown");
			e.printStackTrace();
		}
	}

}
