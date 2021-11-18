package activities;

interface Addable{
	public int add(int num1, int num2);
}
public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable ad1 = (a, b) -> (a + b);
		System.out.println("addition via lamba function, No body " + ad1.add(10, 20));
		Addable ad2 = (int a, int b) -> {
		    return (a + b);
		};
		
		System.out.println("addition via lamba function, with body " + ad2.add(20, 20));
	}

}
