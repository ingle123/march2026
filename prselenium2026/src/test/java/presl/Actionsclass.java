package presl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Nilesh jadhao");
		driver.findElement(By.id("userEmail")).sendKeys("nsjadhao@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("gajanan NAGAR CHIKHLI");
		driver.findElement(By.id("currentAddress")).sendKeys("gajanan NAGAR CHIKHLI")
		driver.findElement(By.id("currentAddress")).sendKeys("pundlik NAGAR CHIKHLI")
		
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform(); 
		
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Thread.sleep(5000);
		driver.close();
		

	}

}

