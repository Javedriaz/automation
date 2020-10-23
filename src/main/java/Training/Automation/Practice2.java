package Training.Automation;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement username =  driver.findElement(By.id("email"));
	
	username.sendKeys("alexandria0786@gmail.com");
	
	WebElement password= driver.findElement(By.id("pass"));
	password.sendKeys("virginia786");
	WebElement Button = driver.findElement(By.id("u_0_b"));
	Button.click();
	WebElement account= driver.findElement(By.xpath("//i[@class='hu5pjgll lzf7d6o1 sp_0Y_EE8spOmD sx_3234a9']"));
	account.click();
	}

}                             
