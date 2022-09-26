package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
			WebDriver driver;
			
			//Constructor that will be automatically called as soon as the object of the class is created
			
			public LoginPage (WebDriver driver) {
				this.driver=driver;
			}
			
			//Locator for username field
			By userName = By.id("txtUsername");
			
			//Locator for password field
			By password = By.id("txtPassword");
			
			//Locator for login button
			By LoginBtn = By.id("btnLogin");
			
			
			
			//Method to enter username
			public void enterUsername(String user)
			 {
				driver.findElement(userName).sendKeys(user);
			}
			
			//Method to enter password
			public void enterPassword(String pswd) {
				driver.findElement(password).sendKeys(pswd);
			}
				
			//Method to click login button
			public void clickLogin() 
			{
				driver.findElement(LoginBtn).click();
			}
		}

	


