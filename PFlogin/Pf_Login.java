package PFlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pf_Login {
	
	WebDriver driver;
	  
  //  By userName = By.name("username");
   // By password = By.name("password");
   // By login = By.xpath("//button[@type='submit']");	
	//WebDriver driver;
	@FindBy(name="username")
	WebElement userName;
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	
	WebElement login;

    public Pf_Login(WebDriver driver){
        this.driver = driver;
        	
        PageFactory.initElements(driver , this);
    
    }

    //Set user name in textbox

    public void setUserName(String strUserName){
    driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox

    public void setPassword(String strPassword){
   // driver.findElement(
    	password).sendKeys(strPassword);
    	
    }

    //Click on login button

    public void clickLogin(){
    driver.findElement(login).click();
    }    

    public void loginToOHRM(String strUserName,String strPasword){
    //Fill user name
    this.setUserName(strUserName);
    //Fill password
    this.setPassword(strPasword);
    //Click Login button
    this.clickLogin();        
    }
}



