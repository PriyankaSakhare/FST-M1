package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity5 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	@BeforeClass
	public void beforeClass() throws MalformedURLException{
		    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("deviceId", "ZY322B8WZK");
		    desiredCapabilities.setCapability("platformName", "android");
		    desiredCapabilities.setCapability("automationName", "UiAutomator2");
		    desiredCapabilities.setCapability("appPackage", "com.android.chrome");
		    desiredCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		    desiredCapabilities.setCapability("noReset", true);

		    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		    wait = new WebDriverWait(driver,10);	
	  } 
  @Test
  public void f() {
	  
	  //launching url
	  driver.findElementById("com.android.chrome:id/search_box_text").click();
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.android.chrome:id/url_bar"))).sendKeys("https://www.training-support.net/selenium");
	  driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout").click();
	  wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.className("android.widget.Button")));
	
	  //scrolling to Login Form
	  String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
	  MobileElement view= driver.findElementByAndroidUIAutomator(UiScrollable + ".scrollIntoView(textContains(\"Login Form\"))");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  view.click();
	  
	  //Testing valid credentials scenario
	  System.out.println("Testing valid credential scenario");
	  driver.findElementByXPath("//android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	  driver.findElementByXPath("//android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");
	  driver.findElementByAndroidUIAutomator(UiScrollable + ".scrollForward()");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button").click();
	  //String text = driver.findElementByClassName("android.widget.TextView").getText();
	  String text = driver.findElement(By.id("action-confirmation")).getText();
	  System.out.println("Action confirmation text for valid credential  is " + text);
	  assertEquals(text,"Welcome Back,admin");
	  
	 //Testing invalid credentials scenario
	  System.out.println("Testing invalid credential scenario");
	  driver.findElementByXPath("//android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("invalid");
	  driver.findElementByXPath("//android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");
	  driver.findElementByAndroidUIAutomator(UiScrollable + ".scrollForward()");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button").click();
	  //String text2 = driver.findElementByClassName("android.widget.TextView").getText();
	  String text2 = driver.findElement(By.id("action-confirmation")).getText();
	  System.out.println("Action confirmation text for valid credential  is " + text2);
	  assertEquals(text2,"Incorrect Credentials");
	  
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  

}
