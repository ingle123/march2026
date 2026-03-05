package presl;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindowhandel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[contains(text(),'Services' )]")).click();
        
        Set< String>sett = driver.getWindowHandles();
        Iterator<String>itr = sett.iterator();
        
        String mainwindow = itr.next();
        String childwindow = itr.next();
        
        Thread.sleep(1000);
         
        if(!mainwindow.equals(childwindow)) {
        	driver.close();
        }

	}

}
