package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExcel {
	private static XSSFWorkbook workbook;
	public static void main(String[] args) throws IOException , FileNotFoundException {
		
		//System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		//driver.manage().window().maximize();
	//	File src = new File("C:\\Users\\ShubhamSharma\\Desktop\\SELENIUM1\\automation.xlsx");
		
		//Load Workbook
		FileInputStream fis = new FileInputStream("C:\\Users\\ShubhamSharma\\Desktop\\SELENIUM1\\TestData\\Googleimages.xlsx");
		 workbook = new XSSFWorkbook(fis);
		
		//Load WorkSheet
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		
		//Load WorkSheet
		XSSFSheet sh = wb.getSheet("Product");
		
		//Print the name load Sheet
		System.out.println(sh.getSheetName());

		//print the name from excel
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		

	}

}
