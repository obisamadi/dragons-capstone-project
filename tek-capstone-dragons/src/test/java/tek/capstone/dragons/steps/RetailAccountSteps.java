package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtilities;

public class RetailAccountSteps extends CommonUtilities {
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

	//@When("User enter email '{string}' and password '{string}'")
	//public void userEnterEmailAndPassword(String email, String password) {
		//WebElement emailInput = factory.signinPage().emailInputFieldLogin;
		//WebElement passwordInput = factory.signinPage().passwordInputFieldLogin;

		//sendText(emailInput, "ubaid.samadi@tekschool.us");
		//sendText(passwordInput, "Ronaldo7!");
		//logger.info("User enters email: " + emailInput + " and password" + passwordInput);
	//}

	// @When("User click on login button")
	// public void userClickOnLoginButton() {
	// click(factory.signinPage().loginBttn);
	// logger.info("User clicks on the login button");
	// }

	// @When("User should be logged in into Account")
	// public void userShouldBeLoggedInIntoAccount() {
	// Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
	// logger.info("User is logged in into the Account");
	// }

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("User clicks on the Account option");
	}

	@When("User update Name 'NameValue' and Phone 'PhoneValue'")
	public void userUpdateNameAndPhone(String NameValue, String PhoneValue) {
		WebElement nameInput = factory.accountPage().nameInput;
		WebElement phoneInput = factory.accountPage().phoneInput;

		sendText(nameInput, NameValue);
		sendText(phoneInput, PhoneValue);
		logger.info("User updates Name: " + NameValue + " and Phone: " + PhoneValue);
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateButton);
		logger.info("User clicks on the Update button");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		WebElement successMessage = factory.accountPage().successMessage;
		Assert.assertTrue(isElementDisplayed(successMessage));
		Assert.assertEquals(successMessage.getText(), "Profile information updated successfully");
		logger.info("User profile information is updated");
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
		logger.info("User clicks on 'Add a payment method' link");
	}

	@When("User fill Debit or credit card information")
	public void userFillCardInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		Map<String, String> cardData = data.get(0);

		WebElement cardNumberInput = factory.accountPage().cardNumberInput;
		WebElement nameOnCardInput = factory.accountPage().nameOnCardInput;
		WebElement expirationMonthInput = factory.accountPage().expirationMonthInput;
		WebElement expirationYearInput = factory.accountPage().expirationYearInput;
		WebElement securityCodeInput = factory.accountPage().securityCodeInput;

		sendText(cardNumberInput, cardData.get("cardNumber"));
		sendText(nameOnCardInput, cardData.get("nameOnCard"));
		sendText(expirationMonthInput, cardData.get("expirationMonth"));
		sendText(expirationYearInput, cardData.get("expirationYear"));
		sendText(securityCodeInput, cardData.get("securityCode"));

		logger.info("User fills the card information");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addCardButton);
		logger.info("User clicks on 'Add your card' button");
	}

	@Then("a message should be displayed 'Payment Method added successfully'")
	public void paymentMethodAddedSuccessfully() {
		WebElement successMessage = factory.accountPage().successMessage;
		Assert.assertTrue(isElementDisplayed(successMessage));
		Assert.assertEquals(successMessage.getText(), "Payment Method added successfully");
		logger.info("Payment Method added successfully message is displayed");
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().removeCardOption);
		logger.info("User clicks on the remove option of card section");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().cardNumberInput));
		logger.info("Payment details have been removed");
	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("User clicks on the Add address option");
	}

	@And("user fill new address form with below information")
	public void userFillNewAddressForm(DataTable dataTable) {
		List<Map<String, String>> addressData = dataTable.asMaps(String.class, String.class);

		String country = addressData.get(0).get("country");
		String fullName = addressData.get(0).get("fullName");
		String phoneNumber = addressData.get(0).get("phoneNumber");
		String streetAddress = addressData.get(0).get("streetAddress");
		String apt = addressData.get(0).get("apt");
		String city = addressData.get(0).get("city");
		String state = addressData.get(0).get("state");
		String zipCode = addressData.get(0).get("zipCode");

		sendText(factory.accountPage().countryInput, country);
		sendText(factory.accountPage().fullNameInput, fullName);
		sendText(factory.accountPage().phoneNumberInput, phoneNumber);
		sendText(factory.accountPage().streetAddressInput, streetAddress);
		sendText(factory.accountPage().aptInput, apt);
		sendText(factory.accountPage().cityInput, city);
		sendText(factory.accountPage().stateInput, state);
		sendText(factory.accountPage().zipCodeInput, zipCode);

		logger.info("User fills new address form");
	}

	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addAddressOption);
		logger.info("User clicks on the Add Your Address button");
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		String expectedMessage = "Address Added Successfully";
		WebElement messageElement = factory.accountPage().addressUpdatedMessage;
		String actualMessage = waitTillPresence(messageElement).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
		logger.info("Address Added Successfully message is displayed");
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressOption);
		logger.info("User clicks on the remove option of Address section");
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editCardOption);
		logger.info("User clicks on Edit option of card section");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
		Map<String, String> cardData = cardInfo.get(0);

		WebElement cardNumberInput = factory.accountPage().cardNumberInput;
		WebElement nameOnCardInput = factory.accountPage().nameOnCardInput;
		WebElement expirationMonthInput = factory.accountPage().expirationMonthInput;
		WebElement expirationYearInput = factory.accountPage().expirationYearInput;
		WebElement securityCodeInput = factory.accountPage().securityCodeInput;

		waitTillPresence(cardNumberInput);
		sendText(cardNumberInput, cardData.get("cardNumber"));
		sendText(nameOnCardInput, cardData.get("nameOnCard"));
		sendText(expirationMonthInput, cardData.get("expirationMonth"));
		sendText(expirationYearInput, cardData.get("expirationYear"));
		sendText(securityCodeInput, cardData.get("securityCode"));

		logger.info("User edits card information");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateCardButton);
		logger.info("User clicks on Update Your Card button");
	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		WebElement successMessage = factory.accountPage().successMessage;
		waitTillPresence(successMessage);
		Assert.assertEquals(successMessage.getText(), "Payment Method updated Successfully");
		logger.info("Payment Method updated Successfully message is displayed");
	}

	@Then("Address details should be removed")
	public void verifyAddressDetailsRemoved() {
		WebElement addressSection = factory.accountPage().addAddressOption;
		waitTillPresence(addressSection);
		boolean isAddressSectionDisplayed = isElementDisplayed(addressSection);
		Assert.assertFalse(isAddressSectionDisplayed);
		logger.info("Address details are removed");
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddressOption);
		logger.info("User clicks on edit address option");
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateAddressButton);
		logger.info("User clicks on update Your Address button");
	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		WebElement successMessage = factory.accountPage().successMessage;
		waitTillPresence(successMessage);
		Assert.assertEquals(successMessage.getText(), "Address Updated Successfully");
		logger.info("Address Updated Successfully message is displayed");
	}

}
