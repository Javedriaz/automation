package PageClassesMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLink {
public WebDriver driver;

@FindBy (xpath = "(//*[@class='nav-a  '])[1]")
WebElement primedaydeal;
@FindBy (xpath = "(//*[@class='nav-a  '])[2]")
WebElement Bestsellers;
@FindBy(xpath = "//a[text()= 'Customer Service']")
 WebElement  customerservice;
@FindBy (xpath = "(//a[text()='New Releases'])[1]")
WebElement NewReleases ;
@FindBy (xpath= "(//*[@class = 'nav-a  '])[5]")
WebElement BasicAmazon;
@FindBy (xpath = "(//*[@class= 'nav-a  '])[6]")
WebElement WholeFoods;
@FindBy (xpath = "(//*[@class= 'nav-a  '])[7]")
WebElement GiftCards;


	
public VerifyLink (WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}

public void Bestsellers() {
	Bestsellers.click();
}

public void customerservice() {
	customerservice.click();
}
public void NewReleases() {
	NewReleases.click();
}


public void primedaydeal() {
	primedaydeal.click();
}
public void BasicAmazon() {
	BasicAmazon.click();
}
public void WholeFoods() {
	WholeFoods.click();
}
public void GiftCards() {
	GiftCards.click();
}
public WebElement GiftCardsverify() {
	return GiftCards;
}
}

