package Training.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Combo.Super_Class;
import PageClassesMethods.ForgotPasswordPage;
import PageClassesMethods.Home;
import PageClassesMethods.Signinpage;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;


public class Amazon extends Super_Class {
	
	
//public  Webdriver driver ;

  @Test(priority = 1)
  public void D() {
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  String ActualURL= driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	
	
	   it.SearchFieldEnter();
	   it.SearchIconClicks();
	   WebElement Customerlinkservice= it.Customerserviceverification();
	   boolean Customer=  Customerlinkservice.isDisplayed();
	    Confirm.assertEquals(Customer, true);
	    Confirm.assertAll();
	    
  }
 /* @Test(priority = 2)
    public void ForgotPsswordFunction() {
	  Home it=new Home(driver);
	  Signinpage ob=new Signinpage (driver);
	  ForgotPasswordPage forgot=new ForgotPasswordPage (driver);
	  it.SignInClick();
	  it.SignINHover();
	  ob.NeedHelpClick();
	  ob.ForgotPassWordClick();
	  forgot.EmailFieldKeys();
	  forgot.ContinueButtonClick();
	 
	  
  }*/
  
  
/*  @BeforeClass
  
  @Parameters("browser")
  public void beforeClass(String browser)  {
	browsers(browser);
  }

 // @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
}

  public void browsers(String br) {
	  if (br.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");
			  driver= new ChromeDriver();
			  driver.get("http://www.amazon.com");
				driver.manage().window().maximize();
				
	  }else if (br.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			driver.get("http://www.amazon.com");
			driver.manage().window().maximize();
		  
	  }
  }*/
  

}
