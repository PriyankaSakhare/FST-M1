package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("title is " + title);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
		System.out.println("The text box is enabled  " + element.isEnabled());
		
		driver.findElement(By.xpath("//*[@id=\"toggleInput\"]")).click();
		System.out.println("The text box is enabled  " + element.isEnabled());
		driver.close();
	}

}
