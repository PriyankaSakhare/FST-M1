package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Activity11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        driver.findElement(By.id("simple")).click();
        
        Alert simpleAlert = driver.switchTo().alert();
        
        String alertText = simpleAlert.getText();
        System.out.println("Alert text is: " + alertText);
        simpleAlert.accept();
        driver.close();
        
	}

}
