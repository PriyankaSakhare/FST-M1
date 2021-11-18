package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7,4,1,3,2,5,6};
		int x;		 
		x= arr.length;
		 
		sorted(arr,x);
		
	}
	public static void sorted(int[] arr, int length) {
		
		
		
		for(int i=1;i<length; i++) {
			int base= arr[i];
			int j=i-1;
			while (j >= 0 && base < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = base;
		}
			
		System.out.println("sorted array is " + Arrays.toString(arr));
		
	}
}
