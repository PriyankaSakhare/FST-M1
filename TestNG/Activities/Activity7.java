package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity7 {
	WebDriver driver;

	 @BeforeClass
		  public void beforeClass() {
			  driver = new FirefoxDriver();
			  driver.get("https://www.training-support.net/selenium/login-form");
			  
	  }
	 @DataProvider(name = "Authentication")
	  public static Object[][] credentials() {
	  return new Object[][] { { "admin", "password" }};
	    }
	 
  @Test (dataProvider = "Authentication")
  public void login(String username, String password) {
	  WebElement usernameField = driver.findElement(By.id("username"));
      WebElement passwordField = driver.findElement(By.id("password"));
      
  
      usernameField.sendKeys(username);
      passwordField.sendKeys(password);

      driver.findElement(By.cssSelector("button[type='submit']")).click();
      

      String Message = driver.findElement(By.id("action-confirmation")).getText();
     assertEquals(Message, "Welcome Back, admin");
  }
  
 

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
