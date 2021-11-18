package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        
        WebElement dropdown= driver.findElement(By.id("single-value"));
        Select list = new Select(driver.findElement(By.id("single-select")));
        list.selectByVisibleText("Option 2");
        System.out.println( "1st output " + dropdown.getText());
        
        list.selectByIndex(3);
        System.out.println("2nd output " + dropdown.getText());
        
        list.selectByValue("4");
        System.out.println("3rd output " +dropdown.getText());
        
        List<WebElement> options = list.getOptions();

        for(WebElement option : options) {
        	System.out.println("Option: " + option.getText());
        }

        driver.close();
      
        
	}

}
