package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Activity9 {
	WebDriver driver;

	 @BeforeClass
		  public void beforeClass() {
			  driver = new FirefoxDriver();
			  driver.get("https://www.training-support.net/selenium/javascript-alerts");
			  Reporter.log("title of the page is " + driver.getTitle());	  
	  }
	 @BeforeMethod
	    public void beforeMethod() {
	        Reporter.log("Test Case Setup is done ");
	        driver.switchTo().defaultContent();
	    }
  @Test(priority=0)
  public void simpleAlertTestcase() {
	  Reporter.log("Execution of simple Alert test case");
	  driver.findElement(By.id("simple")).click();
      Reporter.log("Simple Alert is opened ");

      Alert simpleAlert = driver.switchTo().alert();
      Reporter.log("Switched foucs to simple alert  ");
      String simplealertText = simpleAlert.getText();
      Reporter.log("Alert text is: " + simplealertText);
      
      assertEquals("This is a JavaScript Alert!", simplealertText);

      simpleAlert.accept();
      Reporter.log("Simple Alert is closed");
      Reporter.log(" Simple Alert Test case ended");
  }
  
  @Test(priority=1)
  public void confirmAlertTestcase() {
	  Reporter.log("Execution of confirm Alert test case");
	  driver.findElement(By.id("confirm")).click();
      Reporter.log("confirm Alert is opened ");

      Alert confirmAlert = driver.switchTo().alert();
      Reporter.log("Switched foucs to simple alert  ");
      String confirmalertText = confirmAlert.getText();
      Reporter.log("Alert text is: " + confirmalertText);
      
      assertEquals("This is a JavaScript Confirmation!", confirmalertText);

      confirmAlert.accept();
      Reporter.log("Confirm Alert is closed");
      Reporter.log(" Confirm Alert Test case ended");
}
  
  @Test(priority=2)
  public void promptAlertTestcase() {
	  Reporter.log("Execution of prompt Alert test case");
	  driver.findElement(By.id("prompt")).click();
      Reporter.log("prompt Alert is opened ");

      Alert promptAlert = driver.switchTo().alert();
      Reporter.log("Switched foucs to prompt alert  ");
      String promptalertText = promptAlert.getText();
      Reporter.log("Alert text is: " + promptalertText);
      promptAlert.sendKeys("Admin");
      Reporter.log("Text 'Admin' entered in prompt alert");
      
      assertEquals("This is a JavaScript Prompt!", promptalertText);

      promptAlert.accept();
      Reporter.log("prompt Alert is closed");
      Reporter.log(" prompt Alert Test case ended");
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
