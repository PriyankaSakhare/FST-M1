package activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity13_2a {
	
	public void writeExcel(String filepath) {
		List<String[]> data = new ArrayList<String[]>();
		String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
		String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
		String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
		String[] row3 = {"3", "Lahri", "Rathi", "lahri.rath@example.com", "4528727830"};
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("mysheet.xlsx");
		
		
		data.add(heading);
		data.add(row1);
		data.add(row2);
		data.add(row3);
		
	
		int rownum = 0;
		for (String[] rowData : data) {
		   
		    Row row = sheet.createRow(rownum++);
		    int cellnum = 0;
		    for (String cellData : rowData) {
		       
		        Cell cell = row.createCell(cellnum++);
		        cell.setCellValue(cellData);
		    }
		}
		try {
		FileOutputStream out = new FileOutputStream(new File(filepath));
		workbook.write(out);
		out.close();
		workbook.close();
		} 
		catch (Exception e) {
            e.printStackTrace();
        }
		
	}

	public void readExcel(String filepath) {
		
		try {
			
			FileInputStream file = new FileInputStream(new File(filepath));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			
			while (rowIterator.hasNext()) {
			    Row row = rowIterator.next();
			   
			    Iterator<Cell> cellIterator = row.cellIterator();

			    while (cellIterator.hasNext()) {
			        Cell cell = cellIterator.next();
			        
			        switch (cell.getCellType()) {
			        case NUMERIC: 
			            System.out.print(cell.getNumericCellValue() + " \t ");
			            break;
			        case STRING: 
			            System.out.print(cell.getStringCellValue() + " \t ");
			            break;
			        default:
			            System.out.println("Invalid value");
			            break;
			        }
			    }
			    System.out.println("");
			}
			
			file.close();
            workbook.close();
		}
		catch (Exception e) {
            e.printStackTrace();
        }
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filepath="C:\\Users\\04558M744\\eclipse-workspace\\myxlxssheet.xlsx";
		Activity13_2a objExcelFile = new Activity13_2a();
		objExcelFile.writeExcel(filepath);
		objExcelFile.readExcel(filepath);
		
	}

}
