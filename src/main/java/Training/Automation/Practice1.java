package Training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
         System.setProperty("webdriver.chrome.driver","C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");
	
	    WebDriver Driver=new ChromeDriver();
	    Driver.get("http://www.wellsfargo.com");
	    Driver.manage().window().maximize();
	    
	    
	    WebElement username=Driver.findElement(By.id("userid"));
	    username.sendKeys("muzammal");
	    WebElement password = Driver.findElement(By.id("password"));
	    password.sendKeys("12345");
	    WebElement signinbt = Driver.findElement(By.id("btnSignon"));
	    signinbt.click();
	      Thread.sleep(3000);
	      Driver.navigate().back();
	      
	      WebElement investingtab = Driver.findElement(By.id("investingTab"));
	      investingtab.click();
	      WebElement Commercial = Driver.findElement(By.id("tabNavCommercial"));
	      Commercial.click();
	      Driver.navigate().back();
	
	}
	
}      


