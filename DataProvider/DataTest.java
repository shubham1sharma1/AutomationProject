package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {
	
static String driverPath = "D:\\software\\chromedriver_win32\\chromedriver.exe";
    
    WebDriver driver;
    
     @BeforeTest
       public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
          driver.manage().window().maximize();
     }
	@DataProvider(name="Testdata")
	public Object[] getData()
	{
		Object[] data = new Object[3];
		
		data[0] = "black dress";
		
		data[1] = "white dress";
		
		data[2] = "Red dress";
		
		return data;
	}
	
	@Test(dataProvider="Testdata")
		public void LoginValidation(String data) {
			
		//	System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		//	WebDriver driver = new ChromeDriver();
		//	driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.id("search_query_top")).sendKeys(data);
			driver.findElement(By.xpath("")).click();
		}
	}

