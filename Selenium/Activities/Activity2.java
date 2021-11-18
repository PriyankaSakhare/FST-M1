package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("title is " + title);
		
		WebElement element = driver.findElement(By.id("about-link"));
		boolean output= element.isDisplayed();
		System.out.println("link is displayed by id " + output);
		System.out.println("element text is " + element.getText());
		
		WebElement element2 = driver.findElement(By.className("green"));
		boolean output2= element2.isDisplayed();
		System.out.println("link is displayed by class name " + output2);
		System.out.println("element text is " + element2.getText());
		
		WebElement element3 = driver.findElement(By.linkText("About Us"));
		boolean output3= element3.isDisplayed();
		System.out.println("link is displayed by linkText " + output3);
		System.out.println("element text is " + element3.getText());
	
		WebElement element4 = driver.findElement(By.cssSelector(".green"));
		boolean output4= element4.isDisplayed();
		System.out.println("link is displayed by cssSelector " + output4);
		System.out.println("element text is " + element4.getText());
		
		driver.close();
		
	}

}
