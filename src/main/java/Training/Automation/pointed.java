package Training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pointed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed_1\\Automation_Of_Coding\\Automation\\Driver\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
	   Actions obj=new Actions(driver);
	  // obj.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
	  // obj.moveToElement(driver.findElement(By.xpath("//*[text()='Your Orders'][1]"))).click().build().perform();
	  
	   driver.switchTo().frame(0);
	   WebElement Drag=driver.findElement(By.id("draggable"));
	   
	   WebElement Drop=driver.findElement(By.id("droppable"));
	   obj.dragAndDrop(Drag, Drop).build().perform();
	   driver.switchTo().parentFrame();
	   driver.findElement(By.linkText("Selectable")).click();
	
	  
	}

}
