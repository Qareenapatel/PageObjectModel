package pageobjectmodel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyandExplicitlyWait {

		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
      // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //implicitly wait is always applied globally - is available for all the webElements
        // dynamic in nature
        // it can be changed anywhere and at anytime in your code
        
        
        
        
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        
        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));

        WebElement login = driver.findElement(By.id("btnLogin"));

        
      sendKeys(driver, username, 10, "Admin");
      sendKeys(driver, password, 5, "admin123");
      clickOn(driver, login, 5);
      
     /* WebElement forgotAccount = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
       clickOn(driver, forgotAccount, 5); */
      
       
       //now implicitly wait will override
     //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
       
	}

		//explicitly wait:
		//1. no explicitly keyword or method
		//2. available with WebDriverWait with some expectedcondition
		//3. specific to element
		//4. dynamic in nature
		// we should never use implicitly and explicitly together
		// because selenium webdriver will wait for the element first because of inmplicity wait and then explicitly wait will be applied
		//hence total sync wait will be inceased for each element
		
		
		public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
		{
			new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		}
		public static void clickOn(WebDriver driver, WebElement element, int timeout)
		{
			new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
}
}



/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
.withTimeout(30, TimeUnit.SECONDS) 			
.pollingEvery(5, TimeUnit.SECONDS) 			
.ignoring(NoSuchElementException.class);*/
