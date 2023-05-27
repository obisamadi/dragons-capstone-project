package tek.capstone.dragons.steps;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.When;
import tek.capstone.dragons.utilities.CommonUtilities;
import tek.capstone.dragons.pages.POMFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class RetailSignInSteps extends CommonUtilities {
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {

		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().retailLogo));
		logger.info("user is on retail website");
	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user cliked on Sign In option");

	}

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	    click(factory.homePage().newccountOption);
	    logger.info("user clicked on create new account option");
	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    String name = data.get(0).get("name");
	    String email = data.get(0).get("email");
	    String password = data.get(0).get("password");
	    String confirmPassword = data.get(0).get("confirmPassword");

	    WebElement nameInput = factory.signinPage().getNameInput;
	    WebElement emailInput = factory.signinPage().getEmailInput;
	    WebElement passwordInput = factory.signinPage().getPasswordInput;
	    WebElement confirmPasswordInput = factory.signinPage().getConfirmPasswordInput;

	    nameInput.sendKeys(name);
	    emailInput.sendKeys(email);
	    passwordInput.sendKeys(password);
	    confirmPasswordInput.sendKeys(confirmPassword);

	    logger.info("User fills the sign-up information");
	   
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		WebElement signUpButton = factory.signinPage().getSignUpButton;
	    signUpButton.click();

	    logger.info("User clicks on SignUp button");
	}
	

	//@When("User enter email {string} and password {string}")
	//public void userEnterEmailAndPassword(String emailValue, String passWordValue) {
		//sendText(factory.signinPage().emailInputField, emailValue);
		//sendText(factory.signinPage().passInputField, passWordValue);
		//logger.info("user entered email and password");
	//}

	//@When("User click on login button")
	//public void userClickOnLoginButton() {
		//click(factory.signinPage().loginBttn);
		//logger.info("user clicked on login button");
	//}

	//@Then("User should be logged in into Account")
	//public void userShouldBeLoggedInIntoAccount() {
		//waitTillPresence(factory.homePage().accountOption);
		//Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		//Assert.assertTrue(isElementDisplayed(factory.homePage().ordersOption));
		//Assert.assertTrue(isElementDisplayed(factory.homePage().logOutOption));
		//logger.info("user logged in into account");

	//}
}
