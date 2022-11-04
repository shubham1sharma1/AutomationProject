package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AutomationTest {
			
String driverPath = "D:\\software\\chromedriver_win32\\chromedriver.exe";
    
    WebDriver driver;

    
    AutomationLoginPage objLoginPage;

    AutomationHomePage objHomePage;

    @BeforeTest

    public void setup(){

	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }

    /**

     * This test case will login in https://opensource-demo.orangehrmlive.com/

     * Login to application

     * Verify the home page using Dashboard message

     */

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

     //Create Login Page object

    objLoginPage = new AutomationLoginPage(driver);

    //login to application

    objLoginPage.loginToAP("shubh321@gmail.com","shubh");

    // go the next page

    objHomePage = new AutomationHomePage(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches(".*"));
    driver.close();
    }
        

}

