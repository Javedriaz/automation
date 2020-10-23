package Training.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Combo.Super_Class;
import PageClassesMethods.ForgotPasswordPage;
import PageClassesMethods.Home;
import PageClassesMethods.Signinpage;

public class Amazon_1 extends Super_Class {
	//public WebDriver driver;
  @Test
  public void f() {
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	
	
	   it.SearchFieldEnter();
	   it.SearchIconClicks();
	   WebElement Customerlinkservice= it.Customerserviceverification();
	   boolean Customer=  Customerlinkservice.isDisplayed();
	    Confirm.assertEquals(Customer, true);
	    Confirm.assertAll();
  }
 /* @Test
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
}
