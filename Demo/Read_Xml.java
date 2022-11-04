package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Read_Xml {
	
	static String driverpath = "D:\\software\\chromedriver_win32\\chromedriver.exe";
	
	WebDriver driver;
	
	@Test
	@Parameters({"sProduct"})
	
	public void login(@Optional("red dress")String sProduct) 
	{
		System.setProperty("webdriver.chrome.driver","driverpath");
		driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"search_query_top\"]")).sendKeys(sProduct);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-default button-search\"]")).click();
		//Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		
	}
	

}
