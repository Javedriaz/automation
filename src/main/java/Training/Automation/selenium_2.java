package Training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username =  driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		
		username.sendKeys("alexandria0786@gmail.com");
		
		WebElement password= driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		password.sendKeys("virginia786");
		//Thread.sleep(1000);
		WebElement Ids = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
	
	    Ids.click();
	    WebElement account = driver.findElement(By.xpath("//i[@class='hu5pjgll lzf7d6o1 sp_0Y_EE8spOmD sx_3234a9']"));
	
	    account.click();
	    Thread.sleep(1000);
	    WebElement signout = driver.findElement(By.xpath("//[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql rrkovp55 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8']"));
	    signout.click();
	
	}

}
