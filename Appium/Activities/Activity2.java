package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity2 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
  @BeforeClass
  public void beforeClass() throws MalformedURLException  {
	  
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
	  //launch url
	  driver.get("https://www.training-support.net/");
	  
	  //find about You 
	  driver.findElementByAccessibilityId("About Us").click();
	  
	  //get Title
	  String pagetitle = driver.getTitle();
	  System.out.println("title of th epage is "+ pagetitle);
	  
  }


  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
