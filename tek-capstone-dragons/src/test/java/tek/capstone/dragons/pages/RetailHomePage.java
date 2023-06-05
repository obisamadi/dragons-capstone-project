package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "nameInput")
	public WebElement nameField;
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement emailInput;
	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement passwordInput;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	@FindBy(id = "signupBtn")
	public WebElement signupBtn;
	@FindBy(xpath = "//*[@id=\"accountInformation\"]/div[2]/h1")
	public WebElement yourProfile;

	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement retailLogo;

	@FindBy(xpath = "//*[@id=\"signinLink\"]")
	public WebElement signInOption;

	@FindBy(xpath = "//*[@id=\"accountLink\"]")
	public WebElement accountOption;

	@FindBy(linkText = "Orders")
	public WebElement ordersOption;

	@FindBy(id = "logoutBtn")
	public WebElement logOutOption;

	@FindBy(xpath = "//*[@id=\"orderLink\"]")
	public WebElement clickOrdersSection;

	@FindBy(xpath = "//*[@id=\"newAccountBtn\"]")
	public WebElement newccountOption;

	// Part 2

	@FindBy(xpath = "//span[text()='All']")
	public WebElement allDepartment;
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electroincDepartment;
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computerDepartment;
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHomeDepartment;
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sportDepartment;
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automativeDepartment;

	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div")
	public WebElement profilepage;

}
