package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        driver.findElement(By.id("confirm")).click();
        
        Alert confirmAlert = driver.switchTo().alert();
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);
        
        confirmAlert.accept();
        System.out.println("Alert text accepeted: " + alertText);
        
        driver.findElement(By.id("confirm")).click();
        
        confirmAlert = driver.switchTo().alert();
       alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);
        
        confirmAlert.dismiss();
        System.out.println("Alert text rejected: " + alertText);
        
        driver.close();
        
	}

}
