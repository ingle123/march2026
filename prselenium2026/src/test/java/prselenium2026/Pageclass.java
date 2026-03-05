package prselenium2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageclass {
	
	public static WebDriver driver;
	
	By emailid = By.id("_R_1h6kqsqppb6amH1_");
	By Pass    = By.id("_R_1hmkqsqppb6amH1_");

	public  Pageclass(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Loginid() {
		driver.findElement(emailid).sendKeys("sachin@gmail.com");		
	}
	public void Password() {
	
		driver.findElement(Pass).sendKeys("1233455");
	}

}
