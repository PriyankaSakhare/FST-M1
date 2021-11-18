package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        
        WebElement toggleButton= driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));		
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        toggleButton.click();
        WebDriverWait wait = new WebDriverWait (driver, 20);
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        toggleButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        driver.close();
        
	}

}
