package activities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13_2b {

public List<List<String>> readExcel(String filepath) {
	List<List<String>> data = new ArrayList<List<String>>();
		try {
			
			FileInputStream file = new FileInputStream(new File(filepath));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			
			while (rowIterator.hasNext()) {
			    Row row = rowIterator.next();
			    List<String> rowData = new ArrayList<String>();
			   
			    Iterator<Cell> cellIterator = row.cellIterator();

			    while (cellIterator.hasNext()) {
			        Cell cell = cellIterator.next();
			        
			        System.out.println("last cell num value ="  + row.getLastCellNum());
			        
			        if(row.getLastCellNum() == 5) {
                   
                        rowData.add(cell.getStringCellValue());
                    }
                }
               
                data.add(rowData);
			}
			
			file.close();
            workbook.close();
		}
		catch (Exception e) {
            e.printStackTrace();
        }
		
		return data;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath="C:\\Users\\04558M744\\eclipse-workspace\\myxlxssheet.xlsx";
		Activity13_2b objExcelFile = new Activity13_2b();
		
		List<List<String>> data = objExcelFile.readExcel(filepath);
	    List<String> row;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
		
        row= data.get(1);
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        
        firstName.sendKeys(row.get(1));
        lastName.sendKeys(row.get(2));
  
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(row.get(3));
        
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys(row.get(4));
        
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
       
        Alert message = driver.switchTo().alert();
        

        System.out.println("Alert message: " + message.getText());
        message.accept();
 
        driver.close();
        
        
	}

}
