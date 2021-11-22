package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
	  
 @BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  driver.get("https://www.training-support.net/selenium/target-practice");
		  
	  }	
  @Test
  public void test1() {
	  String pageTitle = driver.getTitle();
	  Assert.assertEquals(pageTitle,"Target Practice");
	  
  }
  
  @Test
  public void test2() {
	 WebElement button= driver.findElement(By.cssSelector(".black"));
	 Assert.assertTrue(button.isDisplayed());
	 Assert.assertEquals(button.getText(),"black");	   
  }
  
  @Test (enabled=false)
  public void test3(){
	  String subHeading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
	  
  }
  
  @Test
  public void test4() {
	  throw new SkipException("Skipping test case");
	  
  }
  


  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
