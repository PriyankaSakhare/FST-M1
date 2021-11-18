package activities;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
       
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));		
		System.out.println("column size is " + cols.size());
		System.out.println("row size is " + rows.size());
		
		WebElement second= driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("second row and second colum is before sorting " + second.getText());
		
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
		WebElement secondafter= driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("second row and second colum is after sorting " + secondafter.getText());
		
		WebElement footer= driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
		System.out.println("footer row after sorting " + footer.getText());
		
		
		driver.close();
	}

}
