package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver = new FirefoxDriver();
				driver.get("https://training-support.net/selenium/dynamic-attributes");
				String pageTitle = driver.getTitle();
		        System.out.println("Page title is: " + pageTitle);
		        WebElement username= driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
		        WebElement password= driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
		        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
		        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
		        
		        username.sendKeys("Priyanka");
		        password.sendKeys("sakhare");
		        confirmPassword.sendKeys("sakhare");
		        email.sendKeys("prsakhar@gmail.com");
		        
		        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		        
		        String message = driver.findElement(By.id("action-confirmation")).getText();
		        System.out.println("Login message: " + message);
		        driver.close();
	}

}
