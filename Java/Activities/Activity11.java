package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<Integer,String> colours =new HashMap<>();
  colours.put(1,"Pink");
  colours.put(2,"Yellow");
  colours.put(3,"Green");
  colours.put(4,"Red");
  colours.put(5,"White");
  
  colours.remove(4);
  
  if(colours.containsValue("Green"))
		  {
	  System.out.println("Map contais Green");
		  }
  
  System.out.println("Size of Map is " + colours.size());
 
 
 
	}

}
