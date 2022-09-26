package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestMainMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        
        LoginPage login = new LoginPage(driver);
        
        
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();
        
        
        
        

	}

}
