package presl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.name("dropdown"));
		Select select = new Select(element);
		select.selectByVisibleText("Manual Testing");
		Thread.sleep(5000);
		driver.close();
		
	}

}
