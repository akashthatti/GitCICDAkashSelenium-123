package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectManager.PageObjectManager;

public class TestContextSetup {
	
	public TestBase testbase;
	public PageObjectManager pom;
	public WebDriver driver;
	
	
	public TestContextSetup() throws IOException {
		testbase = new TestBase();
		pom = new PageObjectManager(testbase.getDriver());
	}

}
