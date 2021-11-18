package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	WebDriver driver = new FirefoxDriver();
			driver.get("https://www.training-support.net");
			String title = driver.getTitle();
			System.out.println("title is " + title);
			driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
			String newTitle=driver.getTitle();
			System.out.println(" New title is " + newTitle);
			driver.close();
	}

}
