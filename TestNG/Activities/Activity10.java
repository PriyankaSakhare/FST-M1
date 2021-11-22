package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Activity10 {
	WebDriver driver;
	Actions builder;

	 @BeforeClass
		  public void beforeClass() {
			  driver = new FirefoxDriver();
			  builder = new Actions(driver);
			  driver.get("https://www.training-support.net/selenium/sliders");
			  Reporter.log("title of the page is " + driver.getTitle());	  
	  }
  @Test
  public void midValueSlider() {
	  WebElement slider= driver.findElement(By.id("slider"));
	  slider.click();
	  String midValue= driver.findElement(By.cssSelector("span#value")).getText();
	  Reporter.log("mid value is :" + midValue );
	  assertEquals(midValue,"50");

  }
  

  @Test
  public void maxValueSlider() {
	  WebElement slider= driver.findElement(By.id("slider"));
	  builder.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();
	  String maxValue= driver.findElement(By.cssSelector("span#value")).getText();
	  Reporter.log("mix value is :" + maxValue );
	  assertEquals(maxValue,"100");

}

  @Test
  public void minValueSlider() {
	  
	  WebElement slider= driver.findElement(By.id("slider"));
	  builder.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();
	  String minValue= driver.findElement(By.cssSelector("span#value")).getText();
	  Reporter.log("min value is :" + minValue );
	  assertEquals(minValue,"0");
  }

  @Test
  public void thirtyValueSlider() {
	  WebElement slider= driver.findElement(By.id("slider"));
	  builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();
	  String thirtyValue= driver.findElement(By.cssSelector("span#value")).getText();
	  Reporter.log("30% slider value is :" + thirtyValue );
	  assertEquals(thirtyValue,"30");
  }
  

  @Test
  public void eightyValueSlider() {
	  WebElement slider= driver.findElement(By.id("slider"));
	  builder.clickAndHold(slider).moveByOffset(45, 0).release().build().perform();
	  String eightyValue= driver.findElement(By.cssSelector("span#value")).getText();
	  Reporter.log("80% slider value is :" + eightyValue );
	  assertEquals(eightyValue,"81");
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
