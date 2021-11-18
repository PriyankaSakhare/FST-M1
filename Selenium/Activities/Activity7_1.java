package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        driver.close();
        
	}

}
