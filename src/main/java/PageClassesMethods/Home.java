package PageClassesMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {


	public WebDriver driver;
	
	
	
	@FindBy(xpath = "(//div[@id='nav-logo']/a/span)[1]")
	WebElement Amazonicon;
	@FindBy(id="twotabsearchtextbox")
	WebElement Searchboxfields;
	
	@FindBy(xpath="(//*[@class='nav-input'])[2]")
	WebElement searchiconclick;
	@FindBy(id="nav-link-accountList")
	WebElement Signinoption;
	@FindBy(xpath = "(//*[text()='Sign in'])[1]")
	WebElement Signinbutton;
	@FindBy(xpath = "//a[text()='Customer Service']")
	WebElement Customer;
	
	public Home(WebDriver driver) {
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
			  
	
		
	}
	
	public void AmazonIconClick() {
		Amazonicon.click();
	}
	public void SearchFieldEnter() {
		   Searchboxfields.sendKeys("cookies");
	}
	   public void SearchIconClicks() {
		   searchiconclick.click();
	   }

	public void SignInClick() {
		Actions ob=new Actions(driver);
		ob.moveToElement(Signinoption).build().perform();
		
	}
	public void SignINHover() {
		Actions ob=new Actions(driver);
		ob.moveToElement(Signinbutton).click().build().perform();
	}
		    public WebElement Customerserviceverification() {
		    	return Customer;
		    }
		    	
		    }
	

