package Training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.com");
	driver.manage().window().maximize();

	/* WebElement Bestseller= driver.findElement(By.linkText("Best Sellers"));
      Bestseller.click();
      driver.navigate().back();
      Thread.sleep(1000);
      WebElement customerservice = driver.findElement(By.linkText("Customer Service"));
      customerservice.click();
      driver.navigate().back();
      Thread.sleep(1000);
      WebElement AmazonBasics = driver.findElement(By.linkText("AmazonBasics"));
      AmazonBasics.click();
      driver.navigate().back();
      Thread.sleep(1000);
      WebElement NewReleases = driver.findElement(By.linkText("New Releases"));
      NewReleases.click();
      driver.navigate().back();
      Thread.sleep(1000);
      WebElement TodayDeals =driver.findElement(By.linkText("Today's Deals"));
      TodayDeals.click();
      driver.navigate().back();*/
     // WebElement selectaddress = driver.findElement(By.id("glow-ingress-line2"));
    // selectaddress.click();
     // WebElement zipcode = driver.findElement(By.id("GLUXZipUpdateInput"));
      //zipcode.sendKeys("22306");
      
  	//WebElement signin = driver.findElement(By.xpath("//i[@class='nav-line-2 nav-short-width']"));
  	//signin.click();
  	//WebElement email = driver.findElement(By.name("email"));
  	//email.sendKeys("alexandria786@gmail.com");
  	//Thread.sleep(1000);
	}

}      


