package desktopPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	public WebElement searchBar;

	@FindBy(xpath = "//input[@id='username']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='PasswordInternal']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='Log_On1']")
	public WebElement logOnButton;

	@FindBy(xpath = "//div[@class='left_menu_icon_overlay']")
	public WebElement topLeftMenu;

	@FindBy(xpath = "//a[contains(text(),'View My Projects / Programs')]")
	public WebElement viewMyProjeccts;

	@FindBy(xpath = "//a[@id='LOCK_Timesheet']")
	public WebElement timeSheet;

	@FindBy(xpath = "//a[@id='LOCK_Time_Tracking']")
	public WebElement timeTracking;

	@FindBy(xpath = "//span[@id=\"tsForSplitUsers-btnEl\"]")
	public WebElement timesheetFor;

	@FindBy(xpath = "//span[@data-qtip=\"Ashwin Kumar S\"]")
	public WebElement ashwinKumarS;

	@FindBy(xpath = "//a[contains(text(),\"Not Filed\")]")
	public WebElement notFiled;

}
