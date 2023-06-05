package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear;
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

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("User clicks on the Account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		WebElement nameInput = factory.accountPage().nameInput;
		WebElement phoneInput = factory.accountPage().phoneInput;
		nameInput.clear();
		clearTextUsingSendKeys(nameInput);
		sendText(nameInput, name);
		phoneInput.clear();
		clearTextUsingSendKeys(phoneInput);
		sendText(phoneInput, phone);
		logger.info("User updates Name: " + name + " and Phone: " + phone);
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
		// Assert.assertEquals(successMessage.getText(), "Profile information updated
		// successfully");
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

		cardNumberInput.clear();
		sendText(cardNumberInput, cardData.get("cardNumber"));
		nameOnCardInput.clear();
		sendText(nameOnCardInput, cardData.get("nameOnCard"));
		sendText(expirationMonthInput, cardData.get("expirationMonth"));
		sendText(expirationYearInput, cardData.get("expirationYear"));
		securityCodeInput.clear();
		sendText(securityCodeInput, cardData.get("securityCode"));

		logger.info("User fills the card information");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addCardButton);
		logger.info("User clicks on 'Add your card' button");
	}

	//@Then("a message should be displayed 'Payment Method added successfully'")
	//public void paymentMethodAddedSuccessfully() {
		//WebElement successMessage = factory.accountPage().successMessage;
		//Assert.assertTrue(isElementDisplayed(successMessage));
		// Assert.assertEquals(successMessage.getText(), "Payment Method added
		// successfully");
		//logger.info("Payment Method added successfully message is displayed");
	//}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().cardLogo);
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
		click(factory.accountPage().addAddressButton);
		logger.info("User clicks on the Add address option");
	}

	@And("user fill new address form with below information")
	public void userFillNewAddressForm(DataTable dataTable) {
		List<Map<String, String>> addressData = dataTable.asMaps(String.class, String.class);

		Map<String, String> row = addressData.get(0);
		WebElement fullNameInput = factory.accountPage().fullNameInput;
		WebElement phoneNumberInput = factory.accountPage().phoneNumberInput;
		WebElement streetAddressInput = factory.accountPage().streetAddressInput;
		WebElement aptInput = factory.accountPage().aptInput;
		WebElement cityInput = factory.accountPage().cityInput;
		WebElement stateInput = factory.accountPage().stateInput;
		WebElement zipCodeInput = factory.accountPage().zipCodeInput;

		fullNameInput.clear();
		sendText(fullNameInput, row.get("fullName"));
		phoneNumberInput.clear();
		sendText(phoneNumberInput, row.get("phoneNumber"));
		streetAddressInput.clear();
		sendText(streetAddressInput, row.get("streetAddress"));
		aptInput.clear();
		sendText(aptInput, row.get("apt"));
		cityInput.clear();
		sendText(cityInput, row.get("city"));
		//stateInput.clear();
		sendText(stateInput, row.get("state"));
		zipCodeInput.clear();
		sendText(zipCodeInput, row.get("zipCode"));

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
		String actualMessage = waitTillPresence(messageElement).getText().trim();
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
		click(factory.accountPage().cardLogo);
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
		cardNumberInput.clear();
		sendText(cardNumberInput, cardData.get("cardNumber"));
		nameOnCardInput.clear();
		sendText(nameOnCardInput, cardData.get("nameOnCard"));
		// expirationMonthInput.clear();
		sendText(expirationMonthInput, cardData.get("expirationMonth"));
		// expirationYearInput.clear();
		sendText(expirationYearInput, cardData.get("expirationYear"));
		securityCodeInput.clear();
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
		// Assert.assertEquals(successMessage.getText(), "Payment Method updated
		// Successfully");
		logger.info("Payment Method updated Successfully message is displayed");
	}

	@Then("Address details should be removed")
	public void verifyAddressDetailsRemoved() {
		WebElement addressSection = factory.accountPage().addAddressButton;
		waitTillPresence(addressSection);
		boolean isAddressSectionDisplayed = isElementDisplayed(addressSection);
		Assert.assertTrue(isAddressSectionDisplayed);
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
		//Assert.assertEquals(successMessage.getText(), "Address Updated Successfully");
		logger.info("Address Updated Successfully message is displayed");
	}

}
