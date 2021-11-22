package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import junit.framework.TestCase;
//import org.junit.After;
//import org.junit.Before;

import static org.testng.Assert.assertEquals;

//import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Activity1 {
	AndroidDriver<MobileElement> driver;
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
      DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
      desiredCapabilities.setCapability("deviceName", "Emulator_Pixel");
      desiredCapabilities.setCapability("platformName", "android");
      desiredCapabilities.setCapability("automationName", "UiAutomator2");
      desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
      desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
      desiredCapabilities.setCapability("noReset", true);

      URL remoteUrl = new URL("http://localhost:4723/wd/hub");

      driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);

  }
  @Test
  public void f() {
	  MobileElement five = driver.findElementById("com.android.calculator2:id/digit_5");
	  five.click();
	  MobileElement plus = driver.findElementById("com.android.calculator2:id/op_add");
	  plus.click();
	  five.click();
	  MobileElement equals = driver.findElementById("com.android.calculator2:id/eq");
	  equals.click();
	  String result = driver.findElementById("result").getText();
	  System.out.println("addition of 2 numbers is " + result);
	  assertEquals(result,"10");
  }
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
