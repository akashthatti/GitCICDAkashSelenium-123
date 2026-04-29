package Docker.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DockerWithCrome {
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String text = driver.findElement(By.xpath("//div/h5")).getText();
		
		
	}
	
	

}
