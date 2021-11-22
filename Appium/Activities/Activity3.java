package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Activity3 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	  @BeforeClass
	  public void beforeClass() throws MalformedURLException  {
		  
		    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("deviceId", "ZY322B8WZK");
		    desiredCapabilities.setCapability("platformName", "android");
		    desiredCapabilities.setCapability("automationName", "UiAutomator2");
		    desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
		    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		    desiredCapabilities.setCapability("noReset", true);

		    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		    wait = new WebDriverWait(driver,10);
	  }
  @Test
  public void sum() {
	  
	  //add 5+9
	   driver.findElementById("com.google.android.calculator:id/digit_5").click();
	   driver.findElementById("com.google.android.calculator:id/op_add").click();
	   driver.findElementById("com.google.android.calculator:id/digit_9").click();
	   driver.findElementById("com.google.android.calculator:id/eq").click();
	   String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
	   System.out.println("addition of 5+9 numbers is " + result);
	   assertEquals(result,"14");
  }

  @Test
  public void substarct() {
	  //substract 10-5
	   driver.findElementById("com.google.android.calculator:id/digit_1").click();
	   driver.findElementById("com.google.android.calculator:id/digit_0").click();
	   driver.findElementById("com.google.android.calculator:id/op_sub").click();
	   driver.findElementById("com.google.android.calculator:id/digit_5").click();
	   driver.findElementById("com.google.android.calculator:id/eq").click();
	   String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
	   System.out.println("substraction of 10-5 numbers is " + result);
	   assertEquals(result,"5");
  }

  @Test
  public void multiplication() {
	  
	  //multiplication 5*100
	   driver.findElementById("com.google.android.calculator:id/digit_5").click();
	   driver.findElementById("com.google.android.calculator:id/op_mul").click();
	   driver.findElementById("com.google.android.calculator:id/digit_1").click();
	   driver.findElementById("com.google.android.calculator:id/digit_0").click();
	   driver.findElementById("com.google.android.calculator:id/digit_0").click();
	   driver.findElementById("com.google.android.calculator:id/eq").click();
	   String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
	   System.out.println("multiplication of of 5*100 numbers is " + result);
	   assertEquals(result,"500");
  }

  @Test
  public void division() {
	  
	  //division 50/2
	   driver.findElementById("com.google.android.calculator:id/digit_5").click();
	   driver.findElementById("com.google.android.calculator:id/digit_0").click();
	   driver.findElementById("com.google.android.calculator:id/op_div").click();
	   driver.findElementById("com.google.android.calculator:id/digit_2").click();
	   driver.findElementById("com.google.android.calculator:id/eq").click();
	   String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
	   System.out.println("division of 50/2 numbers is " + result);
	   assertEquals(result,"25");
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }


}
