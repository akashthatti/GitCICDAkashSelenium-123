package PageObjectManager;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginPage;

public class PageObjectManager {
	
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage getLandingPage() {
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

}
