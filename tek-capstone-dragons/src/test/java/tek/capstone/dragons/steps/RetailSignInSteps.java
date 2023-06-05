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

	@Then("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user cliked on Sign In option");

	}

	@Then("User click on create new account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.homePage().newccountOption);
		logger.info("user clicked on create new account option");
	}

	@Then("User enter {string} and {string} and {string} and {string}")
	public void userEnterAndAndAnd(String name, String email, String password, String confirmpassword) {
		sendText(factory.signinPage().nameInputField, name);
		logger.info(name + " user name was entered successfully");
		sendText(factory.signinPage().emailInputField, email);
		logger.info(email + "email entered successfully");
		sendText(factory.signinPage().passwordInputFieldLogin, password);
		logger.info("password entered successfully");
		sendText(factory.signinPage().getConfirmPasswordInput, confirmpassword);
		logger.info(confirmpassword + " password entered successfully for confirmation");
	}

	@Then("User click on signup button")
	public void userClickOnSignupButton() {
		click(factory.homePage().signupBtn);
		logger.info("Signup button was clicked succesfully");
	}

	@Then("User see his profile page")
	public void userSeeHisProfilePage() {
		slowDown();
		Assert.assertTrue(factory.homePage().profilepage.isDisplayed());
	}

}
