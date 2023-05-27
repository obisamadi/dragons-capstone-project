package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;


public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement retailLogo;
	
	@FindBy(id = "signinLink")
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

	

}
