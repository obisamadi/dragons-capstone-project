package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.pages.RetailAccountPage;
import tek.capstone.dragons.pages.RetailHomePage;
import tek.capstone.dragons.pages.RetailSignInPage;
import tek.capstone.dragons.utilities.CommonUtilities;

public class RetailHomeSteps extends CommonUtilities {

	POMFactory factory = new POMFactory();

	// @Given("User is on retail website")
	// public void userIsOnRetailWebsite() {
	// String actualTitle = getTitle();
	// String expectedTitle = "React App";
	// Assert.assertEquals(actualTitle, expectedTitle);
	// Assert.assertTrue(isElementDisplayed(factory.homePage().retailLogo));
	// logger.info("User is on the retail website");
	// }
	// @When("User click on Sign in option")
	// public void userClickOnSignInOption() {
	// click(factory.homePage().signInOption);
	// logger.info("User clicks on the Sign in option");
	// }

	// @When("User click on Create New Account button")
	// public void userClickOnCreateNewAccountButton() {
	// click(factory.signinPage().newAccountBttn);
	// logger.info("User clicks on Create New Account button");
	// }

	// @When("User fill the signUp information with below data")
	// public void userFillSignUpInformation(DataTable dataTable) {
	// List<Map<String, String>> signUpData = dataTable.asMaps(String.class,
	// String.class);
	// Map<String, String> signUpInfo = signUpData.get(0);

	// WebElement nameInput = factory.signinPage().nameInputField;
	// WebElement emailInput = factory.signinPage().emailInputField;
	// WebElement passwordInput = factory.signinPage().passwordInputFieldLogin;
	// WebElement confirmPasswordInput = factory.signinPage().confirmPassInputField;

	// waitTillPresence(nameInput);
	// sendText(nameInput, signUpInfo.get("name"));
	// sendText(emailInput, signUpInfo.get("email"));
	// sendText(passwordInput, signUpInfo.get("password"));
	// sendText(confirmPasswordInput, signUpInfo.get("confirmPassword"));

	// logger.info("User fills the signUp information");
	// }

	// @When("User click on SignUp button")
	// public void userClickOnSignUpButton() {
	// click(factory.signinPage().signupBttn);
	// logger.info("User clicks on SignUp button");
	// }

	@Then("User should be logged into account page")
	public void verifyUserLoggedIn() {
		WebElement accountPageTitle = factory.accountPage().pageTitle;
		waitTillPresence(accountPageTitle);
		Assert.assertEquals(accountPageTitle.getText(), "Your Profile");
		logger.info("User is verified to be logged into account page");
	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allDepartment);
		logger.info("user clicked on all Department");
	}

	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			// Temporary solution
			String el = option.getText();
			if (el.equals(department)) {
				click(option);
				try {
					logger.info("User clicked on " + el + " sidebar option");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info("Department " + dept.getText() + " is present");
				}

			}
		}

	}

}
