package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        Actions actions = new Actions(driver);
        String text;
        WebElement key = driver.findElement(By.id("keyPressed"));
        Action sequence1= actions.sendKeys("P").build();
        sequence1.perform();
        text = key.getText();
        System.out.println("Pressed key is: " + text);
  
        Action sequence2=actions.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        sequence2.perform();
        
       text = key.getText();
       System.out.println("Pressed key is: " + text);
        driver.close();
	}

}
