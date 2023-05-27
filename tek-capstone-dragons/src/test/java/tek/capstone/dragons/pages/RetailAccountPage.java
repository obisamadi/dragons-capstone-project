package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "profileImage")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalUpdateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement successMessage;
	
	@FindBy(xpath = "//*[@id=\"paymentSubmitBtn\"]")
	public WebElement addCardButton;
	
	@FindBy(xpath = "//*[@id=\"cardNumberInput\"]")
	public WebElement cardNumberInput;
	
	@FindBy(xpath = "//*[@id=\"nameOnCardInput\"]")
	public WebElement nameOnCardInput;
	
	@FindBy(xpath = "//*[@id=\"expirationMonthInput\"]")
	public WebElement expirationMonthInput;

	@FindBy(xpath = "//*[@id=\"expirationYearInput\"]")
	public WebElement expirationYearInput;
	
	@FindBy(xpath = "//*[@id=\"securityCodeInput\"]")
	public WebElement securityCodeInput;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div[1]/img")
	public WebElement addPaymentMethodLink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")
	public WebElement removeCardOption;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div/div/p")
	public WebElement addAddressOption;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div/div/p")
	public WebElement countryInput;
	
	@FindBy(xpath = "//*[@id=\"zipCodeInput\"]")
	public WebElement zipCodeInput;
	
	@FindBy(xpath = "//*[@id=\"newForm\"]/div[5]/div[2]/div/div/select")
	public WebElement stateInput;
	
	@FindBy(xpath = "//*[@id=\"cityInput\"]")
	public WebElement cityInput;
	
	@FindBy(xpath = "//*[@id=\"apartmentInput\"]")
	public WebElement aptInput;

	@FindBy(xpath = "//*[@id=\"streetInput\"]")
	public WebElement streetAddressInput;
	
	@FindBy(xpath = "//*[@id=\"phoneNumberInput\"]")
	public WebElement phoneNumberInput;
	
	@FindBy(xpath = "//*[@id=\"fullNameInput\"]")
	public WebElement fullNameInput;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[2]")
	public WebElement removeAddressOption;

	@FindBy(xpath = "//*[@id=\"accountInformation\"]/div[2]/h1")
	public WebElement pageTitle;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[1]")
	public WebElement editCardOption;
	
	@FindBy(xpath = "//*[@id=\"paymentSubmitBtn\"]")
	public WebElement updateCardButton;
	
	@FindBy(xpath = "//*[@id=\"fuoro79\"]/div[1]/div[2]")
	public WebElement addressUpdatedMessage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[1]")
	public WebElement editAddressOption;
	
	@FindBy(xpath = "//*[@id=\"addressBtn\"]")
	public WebElement updateAddressButton;  
	
	//@FindBy(xpath = "//*[@id=\"cardNumberInput\"]")
	//public WebElement cardDetails;
	
	

}