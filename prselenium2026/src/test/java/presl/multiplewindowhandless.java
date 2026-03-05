package presl;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowhandless {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Windows.html");
driver.manage().window().maximize();
//driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
driver.findElement(By.xpath("//button[contains(text(),'    click   ')]")).click();

Set<String>sett = driver.getWindowHandles();
Iterator<String> itr = sett.iterator();

String mainwindow = itr.next();
String childwindow = itr.next();

if(!mainwindow.equals(childwindow)) {
	Thread.sleep(5000);
	driver.close();
}
	}


}
