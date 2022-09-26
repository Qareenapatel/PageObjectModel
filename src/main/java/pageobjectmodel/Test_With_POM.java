package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_With_POM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.close();
		
	}

}
