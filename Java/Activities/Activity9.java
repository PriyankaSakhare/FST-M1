package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> myList = new ArrayList<>();
  myList.add("Mumbai");
  myList.add("Pune");
  myList.add("Delhi");
  myList.add("Chennai");
  myList.add("Kolkata");
  
  for(String x: myList)
  {
 System.out.println(x);
	}
  
  System.out.println("Thirs element of my List is" + myList.get(2));
  
  if (myList.contains("Pune"))
  {
	  System.out.println("Mylist contains Pune");
  }
  
  System.out.println("Size of my List is"  + myList.size());

  
	myList.remove("Delhi");
	
	System.out.println("Size of my List after removing Delhi"  + myList.size());
	}	
}
