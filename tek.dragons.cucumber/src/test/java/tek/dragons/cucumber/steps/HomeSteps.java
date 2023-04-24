package tek.dragons.cucumber.steps;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.google.gson.Gson;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website home page")
	public void userIsOnRetailWebsiteHomePage() {
		Assert.assertTrue(factory.homePage().tekschoolLogo.isDisplayed());
		logger.info("Tekschool logo is present");
	}
	@Then("User verify retail website title")
	public void userVerifyRetailWebsiteTitle() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info("Expected and Actual Page Title are same" + actualTitle);
	}
	@When("User changes category to {string}")
	public void userChangesCategoryTo(String string) {
		selectByVisibleText(factory.homePage().allDepartments, string);
		logger.info(string + ": Selected from dropdown");
	}
	@When("User enter name item name {string}")
	public void userEnterNameItemName(String string) {
		sendText(factory.homePage().searchTextBox, string);
		logger.info(string + ": value was entered successfully");

	}
	@When("User click on search button")
	public void userClickOnSearchButton() {
		click(factory.homePage().searchBttn);
		logger.info("Search button was clicked successfully");
	}
	@Then("Item should be present on the page")
	public void itemShouldBePresentOnThePage() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().playStationItem));
		logger.info("Item is present");
	}
	@Then("User see the title {string} is present")
	public void userSeeTheTitleIsPresent(String string) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().shopByCatTitle));
		logger.info(string + ": is present");
	}
}
