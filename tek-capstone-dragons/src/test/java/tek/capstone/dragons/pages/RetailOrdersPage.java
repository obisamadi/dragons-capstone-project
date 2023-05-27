package tek.capstone.dragons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrdersPage extends BaseSetup {

	public RetailOrdersPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//img[@class='order__item-img']")
	public WebElement firstOrderItem;

	@FindBy(id = "cancelBtn")
	public WebElement cancelButton;

	@FindBy(xpath = "//*[@id=\"reasonInput\"]")
	public WebElement cancelationReasonDropDown;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div[1]/div[2]/div[2]/button[1]")
	public WebElement CancelOrderButton; 
	
	@FindBy(xpath = "//*[@id=\"orderSubmitBtn\"]")
	public WebElement SecondCancelOrderButton;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div")
	public WebElement yourOrderHasBeenCancelledMessage;

	@FindBy(xpath = "//*[@id=\"returnBtn\"]")
	public WebElement returnItemButton;

	@FindBy(xpath = "//*[@id=\"dropOffInput\"]")
	public WebElement dropOffDropDown;

	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfullMessage;

	@FindBy(xpath = "//*[@id=\"reviewBtn\"]")
	public WebElement reviewButton;

	@FindBy(xpath = "//*[@id=\"headlineInput\"]")
	public WebElement reviewHeadlineInput;

	@FindBy(id = "descriptionInput")
	public WebElement reviewDescriptionInput;

	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitButton;

	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement yourReviewWasAddedSuccessfullyMessage;
	
	@FindBy(xpath = "//*[@id=\"cartBtn\"]/p")
	public WebElement cartIcon;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div[2]/div[3]/span")
	public WebElement categoryDropdown;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input")
	public WebElement searchInput;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/p[1]")
	public WebElement item;
	
	@FindBy(xpath = "")
	public WebElement orderAmount;
	
	@FindBy(id = "orderSuccessMessage")
	public WebElement successMessage;
	
	@FindBy(xpath = "//*[@id=\"orderSubmitBtn\"]")
	public WebElement finalOrderButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select")
	public WebElement quantityInput;
	
	@FindBy(xpath = "//*[@id=\"addToCartBtn\"]/span")
	public WebElement addToCartButton;

	@FindBy(xpath = "//*[@id=\"sidebar\"]/div[2]/div[3]/svg")
	public WebElement categoryElement;

	@FindBy(xpath = "")
	public WebElement orderConfirmationPage;
	
	@FindBy(xpath = "")
	public WebElement getOrderPlacedMessageText;
	
	@FindBy(xpath = "")
	public WebElement clickCartOption;

	@FindBy(xpath = "")
	public WebElement clickProceedToCheckoutButton;
	
	@FindBy(xpath = "")
	public WebElement getPlaceYourOrderButton;
	
	@FindBy(xpath = "//*[@id=\"reasonInput\"]")
	public WebElement returnReasonDropdown;
	
	@FindBy(xpath = "//*[@id=\"orderSubmitBtn\"]")
	public WebElement returnOrderButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div/p")
	public WebElement returnSuccessfulMessage;
	
	@FindBy(xpath = "//*[@id=\"descriptionInput\"]")
	public WebElement reviewTextInput;
	
	@FindBy(xpath = "//*[@id=\"reviewSubmitBtn\"]")
	public WebElement addReviewButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]")
	public WebElement reviewAdded;
	
	
	
	

}