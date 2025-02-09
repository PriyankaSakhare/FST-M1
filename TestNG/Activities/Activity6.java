package activities;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;



public class Activity6 {
	WebDriver driver;
	
 @BeforeClass (alwaysRun = true)
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  driver.get("https://www.training-support.net/selenium/login-form");
		  
	  }	
@Test
@Parameters({"username","password"})
  public void login(String username,String password) {
	 WebElement usernameField = driver.findElement(By.id("username"));
     WebElement passwordField = driver.findElement(By.id("password"));
     
    
     usernameField.sendKeys(username);
     passwordField.sendKeys(password);
     
     driver.findElement(By.cssSelector("button[type='submit']")).click();
     

     String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
     assertEquals(loginMessage, "Welcome Back, admin");
	 
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
