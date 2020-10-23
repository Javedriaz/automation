package Training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.hotmail.com");
	driver.manage().window().maximize();
	//WebElement signinpartial = driver.findElement(By.partialLinkText("signin"));
	//signinpartial.click();
	
	//username.sendKeys("alexandria0786@gmail.com");
	//WebElement next = driver.findElement(By.className("VfPpkd-RLmnJb"));
	//next.click();
	
	}

}
