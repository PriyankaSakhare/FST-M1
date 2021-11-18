package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        driver.findElement(By.id("prompt")).click();
        
        Alert promptAlert = driver.switchTo().alert();
        String alertText = promptAlert.getText();
        System.out.println("Alert text is: " + alertText);
        
        promptAlert.sendKeys("Yes,you are!");
        promptAlert.accept();
       driver.close();
	}

}
