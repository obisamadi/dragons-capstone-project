package tek.dragons.cucumber.steps;


import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class LoginToRetailWebsiteSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Then("I enter username and password")
	public void iEnterUsernameAndPassword(DataTable dataTable) {
		//reading data a list of list
		List<List<String>> data = dataTable.asLists(String.class);
		for(List<String> row : data) {
			sendText(factory.loginPage().emailInputFieldLogin, row.get(0));
			sendText(factory.loginPage().passwordInputFieldLogin, row.get(1));
			logger.info("Username and password were entered successfully");
		}
	}
	
	@Then("I enter email and password")
	public void iEnterEmailAndPassword(DataTable dataTable) {
		//reading data a list of map
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> row : data) {
			sendText(factory.loginPage().emailInputFieldLogin, row.get("email"));
			sendText(factory.loginPage().passwordInputFieldLogin, row.get("password"));
			logger.info("Username and password were entered successfully");
		}
	}
	
	@Then("I enter user information")
	public void iEnterUserInformation(String userInfo) {
		Gson gson = new Gson();
		Map<String, Object> data = gson.fromJson(userInfo, Map.class);
		sendText(factory.loginPage().emailInputFieldLogin, (String) data.get("username"));
		sendText(factory.loginPage().passwordInputFieldLogin, (String) data.get("password"));
		logger.info("Username and password were entered successfully");
	}
	
	@Then("I click on login button on login page")
	public void iClickOnLoginButtonOnLoginPage() {
		click(factory.loginPage().loginBttn);
		logger.info("Login button was clicked successfully");
	}
	
	@Then("I print the following data")
	public void iPrintTheFollowingData(String userInfo) {
		Gson gson = new Gson();
		Map<String, Object> data = gson.fromJson(userInfo, Map.class);
		System.out.println(data.get("username"));
		System.out.println(data.get("password"));
		System.out.println(data.get("number"));
	}
}

