package tek.dragons.cucumber.pages;


public class POMFactory {

	private HomePage homePage;
	private LoginPage loginpage;
	
	public POMFactory() {
		this.homePage = new HomePage();
		this.loginpage = new LoginPage();
	}
	
	public HomePage homePage() {
		return this.homePage;
	}
	public LoginPage loginPage() {
		return this.loginpage;
	}
}
