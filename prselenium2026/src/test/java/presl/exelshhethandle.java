package presl;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exelshhethandle {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
	XSSFWorkbook workbook = new XSSFWorkbook("D:\\Software Testing\\Exeeelsht.xlsx");
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	System.out.println(sheet.getRow(5).getCell(2).getStringCellValue());
	String Url = sheet.getRow(5).getCell(2).getStringCellValue();
	driver.get(Url);
	Thread.sleep(5000);
	driver.close();
			

	}

}
