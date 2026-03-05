package prselenium2026;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass  extends BaseClass {

	public static WebDriver driver;
		@BeforeMethod
		public void Open () {
			driver = BaseFunction();
			
		}
@Test
public void Test() {
	Pageclass  obj = new Pageclass (driver) {
		obj.
		
	}
	@AfterMethod
	public void Close() {
		driver = CloseFunction();

	

}
}
