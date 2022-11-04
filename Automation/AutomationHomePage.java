package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationHomePage {
	
	WebDriver driver;
	
	By homePageUserName = By.xpath("//a[@title='View my customer account']");
	
	public AutomationHomePage(WebDriver driver){

	    this.driver = driver;}

	    //Get the User name from Home Page

	public String getHomePageDashboardUserName(){

	         return driver.findElement(homePageUserName).getText();

	        }
	}

