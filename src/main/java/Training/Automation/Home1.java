package Training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		driver.navigate().refresh();
		driver.navigate().back();
		//Thread.sleep(6000);
		driver.navigate().forward();
		
		//WebElement CreateAnAccount=driver.findElement(By.id("u_0_2"));
		
		// CreateAnAccount.click();
		 
		 //WebElement Forgotlinkclick=driver.findElement(By.linkText("Forgot Password?"));
		// Forgotlinkclick.click();
		 
		 //WebElement Forgotlinkpartial= driver.findElement(By.partialLinkText("Forgot"));
		 
		//Forgotlinkpartial.click();
		/*Thread.sleep(3000);
		 WebElement Firstname= driver.findElement(By.name("firstname"));
		 Firstname.sendKeys("Ali");
		 WebElement Lastname= driver.findElement(By.name("lastname"));
		 Lastname.sendKeys("haider");
		 WebElement Phone= driver.findElement(By.name("reg_email__"));
	
		 Phone.sendKeys("7034624080");
		 WebElement password= driver.findElement(By.name("reg_passwd__"));
		 password.sendKeys("javed786");
		 WebElement Birthmonth= driver.findElement(By.name("birthday_month"));
	       Birthmonth.sendKeys("june");
	       WebElement Birthday= driver.findElement(By.name("birthday_day"));
	       
	       Birthday.sendKeys("16");
	       
	       WebElement Birthyear= driver.findElement(By.name("birthday_year"));
	       Birthyear.sendKeys("1978");
	       WebElement MaleRadioButton= driver.findElement(By.className("_58mt"));
	       MaleRadioButton.click();*/
	       //how can select Radio Button
	      
	}

}    
