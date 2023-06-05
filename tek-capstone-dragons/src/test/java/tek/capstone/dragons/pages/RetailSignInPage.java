package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.utilities.CommonUtilities;

public class RetailSignInPage extends CommonUtilities {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "email")
	public WebElement email;
	@FindBy(id = "signinLink")
	public WebElement signInOption;
	@FindBy(id = "signinLink")
	public WebElement signinBttn;
	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBttn;
	@FindBy(id = "nameInput")
	public WebElement nameInputField;
	@FindBy(id = "emailInput")
	public WebElement emailInputField;
	@FindBy(id = "passwordInput")
	public WebElement passInputField;
	@FindBy(xpath = "//*[@id=\"confirmPasswordInput\"]")
	public WebElement confirmPassInputField;
	@FindBy(xpath = "//*[@id=\"signupBtn\"]")
	public WebElement signupBttn;
	@FindBy(xpath = "//div[@class='account__personal']//h1")
	public WebElement yourProfileText;
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement emailInputFieldLogin;
	@FindBy(xpath = "//*[@id=\"passwordInput\"]")
	public WebElement passwordInputFieldLogin;
	@FindBy(xpath = "//*[@id=\"loginBtn\"]")
	public WebElement loginBttn;
	@FindBy(xpath = "//*[@id=\"nameInput\"]")
	public WebElement getNameInput;

	@FindBy(xpath = "//*[@id=\"emailInput\"]")
	public WebElement getEmailInput;

	@FindBy(xpath = "//*[@id=\"passwordInput\"]")
	public WebElement getPasswordInput;

	@FindBy(xpath = "//*[@id=\"confirmPasswordInput\"]")
	public WebElement getConfirmPasswordInput;

	@FindBy(xpath = "//*[@id=\"signupBtn\"]")
	public WebElement getSignUpButton;

	public void sendRegisterationInfo(String name, String email, String pass, String confirmPass) {
		nameInputField.sendKeys("Ubaid");
		emailInputField.sendKeys("obisamadi1@gmail.com");
		passInputField.sendKeys("Tek@12345");
		confirmPassInputField.sendKeys("Tek@12345");
	}

}