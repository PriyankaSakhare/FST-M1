package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver();
			driver.get("https://training-support.net/selenium/simple-form");
			String title = driver.getTitle();
			System.out.println("title is " + title);
			driver.findElement(By.id("firstName")).sendKeys("Priyanka");
			driver.findElement(By.id("lastName")).sendKeys("Sakhare");
			driver.findElement(By.id("email")).sendKeys("prsakhar@gmail.com");
			driver.findElement(By.id("number")).sendKeys("7028925432");
			driver.findElement(By.cssSelector("input.green")).submit();
			driver.close();
			
			
	}
}
