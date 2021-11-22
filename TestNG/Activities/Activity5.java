package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver driver;
 @BeforeClass (alwaysRun = true)
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  driver.get("https://www.training-support.net/selenium/target-practice");
		  
	  }
	
  @Test(groups = {"HeaderTests", "ButtonTests"},alwaysRun = true)
  public void pageTitle() {
	  String title= driver.getTitle();
	  System.out.println("Title of the page is " + title);
	  assertEquals(title, "Target Practice");  
  }
  
  @Test(dependsOnMethods = {"pageTitle"} , groups = {"HeaderTests"})
  public void header1Test() {
	  
	  String header1= driver.findElement(By.cssSelector("h3#third-header")).getText();
	  System.out.println("3rd header of the page is " + header1);
	  assertEquals(header1, "Third header");  
  }
  @Test(dependsOnMethods = {"pageTitle"} , groups = {"HeaderTests"})
 public void header3Test() {
     WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
     assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)") ;
  }
  
  @Test(dependsOnMethods = {"pageTitle"} ,groups = {"ButtonTests"})
 public void ButtonTest1() {
     WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
     assertEquals(button1.getText(), "Olive");
 }
 
 @Test (dependsOnMethods = {"pageTitle"} ,groups = {"ButtonTests"})
 public void ButtonTest2() {
     WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
     assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
 }
 
 
  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  driver.close();
  }

}
