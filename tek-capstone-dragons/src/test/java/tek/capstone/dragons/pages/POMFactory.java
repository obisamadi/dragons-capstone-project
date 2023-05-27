package tek.capstone.dragons.pages;

import tek.capstone.dragons.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private RetailHomePage homePage;
	private RetailAccountPage accountpage;
	private RetailOrdersPage orderpage;
	private RetailSignInPage signInPage;

	public POMFactory() {
		this.signInPage = new RetailSignInPage();
		this.homePage = new RetailHomePage();
		this.accountpage = new RetailAccountPage();
		this.orderpage = new RetailOrdersPage();
	}

	public RetailHomePage homePage() {
		return this.homePage;
	}

	public RetailAccountPage accountPage() {
		return this.accountpage;
	}

	public RetailOrdersPage orderPage() {
		return this.orderpage;

	}
	
	public RetailSignInPage signinPage() {
		return this.signInPage;
	}


}
