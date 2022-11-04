package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogIn {
		
	@Test
	public void Login()
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://automationpractice.com/index.php");  // Launch the automationpractice browser
		
	    String str = driver.getTitle();
		System.out.println("The title of the webpage is "+ str);
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click(); // click on sign in 
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubh321@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("shubh");
		
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		if(driver.findElement(By.xpath("//a[@title='View my customer account']")).isDisplayed())
		{
			System.out.println("The confirmation is ---> " + driver.findElement(By.xpath("//a[@title='View my customer account']")).getText());        
		}
		else {
			driver.navigate().back();
		}
			
		}


		
	
	
}

