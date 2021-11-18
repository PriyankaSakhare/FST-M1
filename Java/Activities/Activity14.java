package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\04558M744\\IBM FST Projects\\resources\\textfile.txt");
		try {
		 file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("File is created " + FileUtils.getFile("C:\\Users\\04558M744\\IBM FST Projects\\resources\\textfile.txt"));
		
	}

}
