package PageClassesMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Orders {



public WebDriver driver;

@FindBy (xpath="(//*[@class='nav-line-2'])[2]")
  WebElement  order;

@FindBy (name="email")
WebElement emailfield;

@FindBy (id = "continue")

WebElement Continue;

@FindBy (id = "ap_password")
WebElement passfield;
@FindBy(id= "signInSubmit")
WebElement signin;



public Orders (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void EmailFieldKeys() {
	emailfield.sendKeys("javed786@gmail.com");

}



public void orderclick() {
	order.click();
}
public void Continue() {
	Continue.click();
}

public void passfieldkeys() {
	passfield.sendKeys("qasddddd");	
}
public void Signin() {
	signin.click();
}


}