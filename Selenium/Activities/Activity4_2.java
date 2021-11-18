package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("title is " + title);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Sakhare");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("prsakhar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("7028925432");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).submit();
		driver.close();
	}

}
