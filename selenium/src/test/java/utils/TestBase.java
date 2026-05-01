package utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.http.WebSocketHandshakeException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver getDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(new File("/src/test/resources/global.properties"));
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			}
		}
		
		return driver;
		
	}

}
