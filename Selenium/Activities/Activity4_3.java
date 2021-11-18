package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String title = driver.getTitle();
		System.out.println("title is " + title);
		
		
		String header= driver.findElement(By.xpath("//h3")).getText();
		System.out.println("Third header text is " + header);
		
		String header2 = driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("Fifth header color is " + header2);
		
		String voilet =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
		System.out.println("class attribute value of Voilet button is " + voilet);	
		
		boolean gray= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).isDisplayed();
		System.out.println("gray button is found by xpath = " + gray);
		
		driver.close();
	}

}
