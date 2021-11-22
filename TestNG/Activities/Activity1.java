package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity1 {
	WebDriver driver;
 @BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  driver.get("https://www.training-support.net");
	  }
	  
  @Test
  public void f() {
	  
	  String title= driver.getTitle();
	  System.out.println("Title of the page is " + title);
	  assertEquals(title, "Training Support");
	  driver.findElement(By.id("about-link")).click();
	  String title2= driver.getTitle();
	  System.out.println("Title of the new page is " + title2);
	  assertEquals(title2, "About Training Support");
	  
  }
  
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
