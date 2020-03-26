package desktopPageObjects;

import java.util.List;

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

	@FindBy(xpath = "//input[@id='login']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='Log_On']")
	public WebElement logOnButton;

	@FindBy(xpath = "//div[@class='left_menu_icon_overlay']")
	public WebElement topLeftMenu;

	@FindBy(xpath = "//a[contains(text(),'View My Projects')]")
	public WebElement viewMyProjeccts;

	@FindBy(xpath = "//a[contains(text(),'Comcast-BSD-BCP-QA-Voice 2018')]")
	public WebElement comcastBSD;

	@FindBy(xpath = "//a[@id='LOCK_Plan']")
	public WebElement plan;
	
	
	@FindBy(xpath = "//div[contains(@class,'x-grid-cell-inner')][contains(text(),'SPR')]")
	public WebElement SPR;
	
	
	@FindBy(xpath = "//div[contains(@class,'x-grid-cell-inner')][contains(text(),'213')]")
	public WebElement sprint213;
	
	
	
	
	
	@FindBy(xpath = "//a[@id='LOCK_Sprints']")
	public WebElement sprints;
	
	
	
	@FindBy(xpath = "//a[@name='KEY_User_Story']")
	public WebElement userStoryTab;
	
	
	
	@FindBy(xpath = "//tbody/tr[@class='  x-grid-row']/td[2]")
	public List<WebElement> userstoriesListElements;
	
	
	
	@FindBy(xpath = "//a[@id='a_10564943']")
	public WebElement toDos;
	
	
	
	@FindBy(xpath = "//td[@aria-describedby='toDoGridTable_owner']")
	public List<WebElement> toDoGridTable_owner;
	
	
	
	
	@FindBy(xpath = "//td[@aria-describedby='toDoGridTable_owner']/../td[9]")
	public List<WebElement> eightText;
	
	
	
	
	
	@FindBy(xpath = "//td[@aria-describedby=\"toDoGridTable_TASKCODE\"]")
	public List<WebElement> constantDummyClick;
	
	
	
	@FindBy(xpath = "//a[@name='Definition of Done']")
	public WebElement defenitionOfDone;
	
	
	
	
	
	@FindBy(xpath = "//select[contains(@id,\"metric\")]")
	public List<WebElement> defOfDoneSelectBoxesList;
	
	
	
	@FindBy(xpath = "//*[@id=\"SaveBtn\"]")
	public WebElement saveButton;
	
	
	
	
	@FindBy(xpath = "//*[@role='select']")
	public WebElement selectBoxElement;
	
	
	
	
	@FindBy(xpath = "//td[@role=\"gridcell\"]//*[@role=\"checkbox\"]")
	public List<WebElement> tickBoxes;
	
	
	
	@FindBy(xpath = "//*[@title='Delete ToDo']")
	public WebElement deleteTodo;
	
	

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
