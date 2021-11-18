package activities;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait =new WebDriverWait(driver,5);
		driver.get("https://www.training-support.net/selenium/tab-opener");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        String parentwindowhandle= driver.getWindowHandle();
        System.out.println("window handle is " + parentwindowhandle);
        
        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles are: " + allWindowHandles);
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        

        System.out.println("Current window handle: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New Tab Title is: " + driver.getTitle());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='content']")));
        String newTabText = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("New tab heading is: " + newTabText);
 
        
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
 
        
        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);
 
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
 
        
        System.out.println("New tab handle: " + driver.getWindowHandle());
 
    
        wait.until(ExpectedConditions.titleIs("Newtab2"));
 
        
        System.out.println("New Tab Title is: " + driver.getTitle());
 
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='content']")));
        newTabText = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("New tab heading is: " + newTabText);
 
        
        driver.quit();
	}

}
