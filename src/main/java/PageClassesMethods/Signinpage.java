package PageClassesMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {

	
	public WebDriver driver;
	@FindBy(linkText = "Need help?")
	WebElement NeedHelpoption;
	@FindBy(linkText = "Forgot your password?")
	WebElement ForgotPasswordRecover;
	
	public Signinpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
		
		public void NeedHelpClick() {
			NeedHelpoption.click();
			
		}
	
           public void  ForgotPassWordClick() {
        	   ForgotPasswordRecover.click();
           }


}







