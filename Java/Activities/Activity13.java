package activities;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random();
		
		System.out.println("Enter array elements");
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index value" + index);
		System.out.println("value in the array is" + nums[index]);
		scan.close();
        
	}

}
