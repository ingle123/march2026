package presl;

import java.io.File;
import java.io.IOException;
import java.sql.Time;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v142.page.model.FileHandler;
import org.openqa.selenium.devtools.v142.page.model.Screenshot;
import org.openqa.selenium.devtools.v144.headlessexperimental.model.ScreenshotParams;

public class TakeScreenshot {

	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	

		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  //String screenshotBase64 = ((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);
          FileHandler.copy(screenshotFile,new File("D:\\WorkSpace2025\\prselenium2026\\Screenshottss\\secondpng"));
		//  FileUtils.copyFile(screenshotFile, new File("D:\\WorkSpace2025\\prselenium2026\\first.png"));
		 System.out.println("successful");
		   Thread.sleep(5000); 
		   driver.close();
		   


	}

}
