package PFlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pf_Home {
	
	WebDriver driver;

   // By homePageUserName = By.xpath("//p[@class='oxd-userdropdown-name']");
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement homePageUserName;

public Pf_Home(WebDriver driver){

    this.driver = driver;}

    //Get the User name from Home Page

		public String getHomePageDashboardUserName() throws InterruptedException{
			Thread.sleep(3000);
			System.out.println(homePageUserName.getText());

    return homePageUserName.getText();

        }
}

	


