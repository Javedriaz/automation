package Combo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Super_Class {
 public WebDriver driver;
	 

  @BeforeClass
  
  @Parameters("browser")
  public void beforeClass(String browser) {
	  if (browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");
			  driver= new ChromeDriver();
			  
			 driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
				
	  }else if (browser.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		  
			
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			driver.navigate().back();
	  }
  }

  @AfterClass
  public void afterClass() throws InterruptedException, IOException {
	  Thread.sleep(6000);
	pictures();
	  driver.close();
  }

 public void pictures() throws IOException {
	  Date dt=new Date();
	  String sd =dt.toString().replace(" ", "_").replace(":", "_")+".png";
	  File di = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(di, new File("C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\picture\\"+sd));
}
	
}





