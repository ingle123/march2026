package prselenium2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	public WebDriver BaseFunction() {
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	return driver;
	}

	public WebDriver CloseFunction() {
		driver.close();
		return driver;
	}
}
