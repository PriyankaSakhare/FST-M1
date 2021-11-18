package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        
        WebElement dropdown= driver.findElement(By.id("multi-select"));
        Select multilist = new Select(driver.findElement(By.id("multi-select")));
        
    if(multilist.isMultiple()) {
    	
    	 multilist.selectByVisibleText("Javascript");
         System.out.println(dropdown.getText());
         
         multilist.selectByValue("node");
         System.out.println(dropdown.getText());
         
         for(int i=4; i<=6; i++) {
             multilist.selectByIndex(i);
         }
         System.out.println(dropdown.getText());
         
         multilist.deselectByValue("node");
         System.out.println(dropdown.getText());
         
         multilist.deselectByIndex(7);
         System.out.println(dropdown.getText());
         
         multilist.getFirstSelectedOption();
         System.out.println(dropdown.getText());
         
         List<WebElement> selectedOptions = multilist.getAllSelectedOptions();
         for(WebElement selectedOption : selectedOptions) {
         System.out.println("Selected option: " + selectedOption.getText());
         }
         
         multilist.deselectAll();
         System.out.println(dropdown.getText());
            
	}
    driver.close();
	}
}
