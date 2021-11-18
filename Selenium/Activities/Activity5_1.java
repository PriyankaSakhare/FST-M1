package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("title is " + title);
		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
		System.out.println("The checkox input is displayed  " + element.isDisplayed());
		
		driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
		System.out.println("The checkox input is displayed  " + element.isDisplayed());
		driver.close();

	}

}
