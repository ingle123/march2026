package presl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rtclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement ele =  driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(5000);
		driver.close();
		

	}

}
