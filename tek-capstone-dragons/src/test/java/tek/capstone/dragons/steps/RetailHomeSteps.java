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

	@Then("User verify retail website title")
	public void userVerifyRetailWebsiteTitle() {
		WebElement accountPageTitle = factory.homePage().retailLogo;
		waitTillPresence(accountPageTitle);
		Assert.assertEquals(accountPageTitle.getText(), "TEKSCHOOL");
		logger.info("User is verified to be logged into account page");
	}

	@Given("User is on retail website home page")
	public void userIsOnRetailWebsiteHomePage() {
		String expectedTitle = getTitle();
		String actualTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().retailLogo));
		logger.info("User is on the retail website");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.homePage().emailInput, email);
		logger.info("email was sent successfully");
		sendText(factory.homePage().passwordInput, password);
		logger.info("password was sent successfully");
	}

	@Then("User click on sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("User clicked on signin button successfully");
	}

	@Then("user should be logged into Account")
	public void userShouldBeLoggedIntoAccount() {
		waitTillPresence(factory.homePage().accountOption);
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().ordersOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutOption));
		logger.info("user logged in into account");
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
