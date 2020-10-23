package Training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//button[@aria-label='Check-in October 12, 2020']")).click();
	driver.findElement(By.xpath("//button[@aria-label='Oct 9, 2020']")).click();
	driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();
	
	
	
	}

}
