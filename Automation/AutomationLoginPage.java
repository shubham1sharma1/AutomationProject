package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationLoginPage {
	WebDriver driver;
	  
    By userName = By.id("email");
    By password = By.id("passwd");
    By login = By.xpath("//button[@id='SubmitLogin']");

    public AutomationLoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Set user name in textbox

    public void setUserName(String strUserName){
    driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox

    public void setPassword(String strPassword){
    driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button

    public void clickLogin(){
    driver.findElement(login).click();
    }

    public void loginToAP(String strUserName,String strPasword){
    //Fill user name
    this.setUserName(strUserName);
    //Fill password
    this.setPassword(strPasword);
    //Click Login button
    this.clickLogin();        
    }
}


