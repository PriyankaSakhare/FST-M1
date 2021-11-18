package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,77,10,54,-11,10};
		 int x;
		 int sum=0;
		 x= arr.length;
		 
		 System.out.println("result "+ result(arr,x,sum));
	}
	
	
		public static boolean result(int[] arrNum, int x ,int sum) {
		
		for(int i=0; i<x; i++)
		{
			if(arrNum[i]==10)
			{
				sum=sum+arrNum[i];
			}
		}
			
		if(sum==30) {
			System.out.println("sum is 30");
		}
		
		else{
			System.out.println("Sum is not 30");
		}
		
		return sum==30;
	}
}
	

