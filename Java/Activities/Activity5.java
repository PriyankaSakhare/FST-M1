package activities;

abstract class Book {

	String title;
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
	}
}
class MyBook extends Book {
	    //Define abstract method
	    public void setTitle(String s) {
	        title = s;
	    }
}	

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook mybook = new MyBook();
		mybook.setTitle("Priyanka's Book");
		
		System.out.println("The title is: " + mybook.getTitle());

	}
}
