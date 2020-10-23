package Training.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Combo.Super_Class;
import PageClassesMethods.Home;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class Provider extends Super_Class {
  @Test(dataProvider = "search")
  public void f( String t) {
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

  @DataProvider
  public Object[][] search() {
    return new Object[][] {
      new Object[] { "phone" },
      new Object[] { "Home" },
      new Object[] { "Store"},
    };
  }
}
