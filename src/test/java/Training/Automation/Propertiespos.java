package Training.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Combo.Super_Class;
import PageClassesMethods.Home;

public class Propertiespos extends Super_Class {
  @Test
  public void f() throws IOException {
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  Properties pro = new  Properties();
	    FileInputStream ob = new FileInputStream("C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\Amazon.properties");
	    pro.load(ob);
	    String name = pro.getProperty("Name");
	
	   it.SearchFieldEnter();
	   it.SearchIconClicks();
	   WebElement Customerlinkservice= it.Customerserviceverification();
	   boolean Customer=  Customerlinkservice.isDisplayed();
	    Confirm.assertEquals(Customer, true);
	    Confirm.assertAll();
	   
  }
  
}
