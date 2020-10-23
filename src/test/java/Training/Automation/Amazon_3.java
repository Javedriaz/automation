package Training.Automation;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import Combo.Super_Class;
import ComonListeners.Listeners;
import PageClassesMethods.VerifyLink;

public class Amazon_3  extends Super_Class {
  


@Test
  public void f() throws IOException {
	  VerifyLink  V = new  VerifyLink(driver);
	  Listeners L = new  Listeners();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertAll();
	 V.primedaydeal();
	 pictures();
	 String  ActualURL  = driver.getCurrentUrl();
	 SoftAssert confirm =new SoftAssert();
	confirm.assertEquals(ActualURL, "(https://www.amazon.com/primeday?ref_=nav_td_pd_dt_cr");
	// Assert.assertEquals(ActualURL, "https://www.amazon.com/primeday?ref_=nav_td_pd_dt_cr");
	 
	 driver.navigate().back();
	  V.Bestsellers();
	  pictures();
	  driver.navigate().back();
	  V.customerservice();
	  pictures();
	  driver.navigate().back();
      V.NewReleases();
     
      driver.navigate().back();
       V.BasicAmazon();
       driver.navigate().back();
     V.WholeFoods();
     driver.navigate().back();
    // V.GiftCardsverify();
   // driver.navigate().back();
      /*    WebElement GiftCardsverify  = V.GiftCardsverify();
      boolean GiftCards    =  GiftCardsverify.isDisplayed();
       Assert.assertEquals(GiftCards, true);
        confirm.assertAll();  
  
 
  
  }*/
     
  
  
}


}
