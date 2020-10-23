package Training.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
	}

}
