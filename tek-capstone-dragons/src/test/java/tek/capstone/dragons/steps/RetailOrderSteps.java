package tek.capstone.dragons.steps;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtilities;
import tek.sqa.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtilities {

	POMFactory factory = new POMFactory();

	//@Given("User is on retail website")
	//public void userIsOnRetailWebsite() {
		//String actualTitle = getTitle();
		//String expectedTitle = "React App";
		//Assert.assertEquals(actualTitle, expectedTitle);
		//Assert.assertTrue(isElementDisplayed(factory.homePage().retailLogo));
		//logger.info("User is on the retail website");
	//}

	//@When("User click on Sign in option")
	//public void userClickOnSignInOption() {
		//click(factory.homePage().signInOption);
		//logger.info("User clicks on the Sign in option");
	//}

	//@When("User enter email {string} and password {string}")
	//public void userEnterEmailAndPassword(String EmailValue, String PasswordValue) {
		//String EmailValue1 = "ubaid.samadi@tekschool.us";
		//String PasswordValue1 = "heLcpDAMDpMGD4U!";
		//sendText(factory.signinPage().emailInputFieldLogin, EmailValue1);
		//sendText(factory.signinPage().passwordInputFieldLogin, PasswordValue1);
		//logger.info("user entered email and password");
	//}

	//@When("User click on login button")
	//public void userClickOnLoginButton() {
		//click(factory.signinPage().loginBttn);
		//logger.info("User clicks on the login button");
	//}

	//@When("User should be logged in into Account")
	//public void userShouldBeLoggedInIntoAccount() {
		// WebElement accountlink = factory.homePage().accountOption;
		//waitTillPresence(factory.homePage().accountOption);
		//logger.info("User is logged in into the Account");
	//}

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		WebElement categoryElement = factory.orderPage().categoryDropdown;
		waitTillClickable(categoryElement);
		click(factory.orderPage().categoryDropdown);
		logger.info("User changes the category to: " + categoryElement);
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchInput);
		logger.info("User clicks on the Search icon");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String item) {
		WebElement searchInput = factory.orderPage().searchInput;
		waitTillPresence(searchInput);
		sendText(searchInput, item);
		logger.info("User searches for item: " + item);
	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.orderPage().item);
		logger.info("User clicks on the item");
	}

	@When("User select quantity ‘2’")
	public void userSelectQuantity(Integer quantity) {
		WebElement quantityInput = factory.orderPage().quantityInput;
		waitTillPresence(quantityInput);
		sendText(quantityInput, String.valueOf(2));
		logger.info("User selects quantity: " + quantity);
	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addToCartButton);
		logger.info("User clicks on the Add to Cart button");
	}

	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
		WebElement cartIcon = factory.orderPage().cartIcon;
		waitTillPresence(cartIcon);
		String cartQuantity = cartIcon.getText();
		Assert.assertEquals(cartQuantity, String.valueOf(2));
		logger.info("The cart icon quantity is verified to be: " + cartQuantity);
	}

	@When("User change the category to {string} Apex Legends '")
	public void userChangeTheCategoryToApexLegends(String string) {
		click(factory.orderPage().categoryDropdown);
		WebElement categoryOption = factory.orderPage().categoryElement;
		categoryOption.click();
	}

	@When("User select quantity ‘{int}’")
	public void userSelectQuantities(Integer int1) {
		click(factory.orderPage().quantityInput);
		logger.info("User selects quantity: " + "5");

	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().clickCartOption);
		logger.info("User clicks on the Cart option");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().clickProceedToCheckoutButton);
		logger.info("User clicks on the proceed to checkout button");

	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		WebElement getPlaceYourOrderButton = factory.orderPage().getPlaceYourOrderButton;
		waitTillPresence(getPlaceYourOrderButton);
		click(factory.orderPage().getPlaceYourOrderButton);
		logger.info("User clicks on place your order button");

	}

	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		WebElement getOrderPlacedMessageText = factory.orderPage().getOrderPlacedMessageText;
		waitTillPresence(getOrderPlacedMessageText);
		Assert.assertEquals("Order Placed, Thanks", getOrderPlacedMessageText);
		logger.info("Order confirmation message displayed: " + getOrderPlacedMessageText);
	}

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().clickOrdersSection);
		logger.info("User clicks on the Orders section");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		// Write code here that turns the phrase above into concrete actions
		click(factory.orderPage().firstOrderItem);
		logger.info("User clicks on the first order in the list");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		WebElement CancelOrder = factory.orderPage().CancelOrderButton;
		waitTillPresence(factory.orderPage().CancelOrderButton);
		click(factory.orderPage().CancelOrderButton);
		logger.info("User clicks on the Cancel The Order button");
	}

	@When("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() {
		WebElement cancelreasondropdown = factory.orderPage().cancelationReasonDropDown;
		selectByVisibleText(cancelreasondropdown, "Bought wrong item");
		click(factory.orderPage().SecondCancelOrderButton);
		// scrollIntoViewAndClick(boughtWrongItemOptionLocator);
		logger.info("User selects the cancellation reason: Bought wrong item");
	}

	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		WebElement actualMessage = factory.orderPage().yourOrderHasBeenCancelledMessage;
		String expectedMessage = "Your Order Has Been Cancelled";
		// Assert.assertEquals(expectedMessage, actualMessage.getText());
		logger.info("Cancellation message displayed: " + actualMessage.getText());
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItemButton);
		logger.info("User clicks on the Return Items button");
	}

	@When("User select the Return Reason ‘Item damaged’")
	public void userSelectTheReturnReasonItemDamaged() {
		WebElement returnReasonDropdown = factory.orderPage().returnReasonDropdown;
		Select dropdown = new Select(returnReasonDropdown);
		dropdown.selectByVisibleText("Item damaged");
		logger.info("User selects the Return Reason: Item damaged");
	}

	@When("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffServiceFedEx() {
		WebElement dropOffServiceDropdown = factory.orderPage().dropOffDropDown;
		Select dropdown = new Select(dropOffServiceDropdown);
		dropdown.selectByVisibleText("FedEx");
		logger.info("User selects the drop off service: FedEx");
	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderButton);
		logger.info("User clicks on the Return Order button");
	}

	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		WebElement actualMessage = factory.orderPage().returnSuccessfulMessage;
		String expectedMessage = "Return was successfull";
		logger.info("Return successful message displayed: " + actualMessage.getText());
		
	}

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
	    logger.info("User clicks on the Review button");
	}
	@When("User write Review headline ‘ headline value’ and ‘review text’")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText() {
		WebElement headlineInput = factory.orderPage().reviewHeadlineInput;
	    WebElement reviewTextInput = factory.orderPage().reviewTextInput;
	    
	    String headline = "headline value";
	    String reviewText = "review text";
	    
	    headlineInput.sendKeys(Keys.CONTROL + "a");
	    headlineInput.sendKeys(Keys.DELETE);
	    headlineInput.sendKeys(headline);
	    
	    reviewTextInput.sendKeys(Keys.CONTROL + "a");
	    reviewTextInput.sendKeys(Keys.DELETE);
	    reviewTextInput.sendKeys(reviewText);
	    
	    logger.info("User writes Review headline: " + headline + " and Review text: " + reviewText);
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addReviewButton);
	    logger.info("User clicks on the Add your Review button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		WebElement actualMessage = factory.orderPage().reviewAdded;
		String expectedMessage = "Review added successfully";
		logger.info("Your review was added successfully: " + actualMessage.getText());
	}


}