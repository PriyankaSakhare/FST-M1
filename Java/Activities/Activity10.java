package activities;


import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		  hs.add("Mumbai");
		  hs.add("Pune");
		  hs.add("Delhi");
		  hs.add("Chennai");
		  hs.add("Kolkata");
		  hs.add("Nagpur");
	
		  System.out.println("size of hashset is  "+ hs.size());
		  System.out.println(hs);
		  
		  hs.remove("Chennai");
		  hs.remove("Wardha");
		  
		  if(hs.contains("Agra"))
		   {
			  System.out.println("Set contains agra");
		   }
		  else {
			  System.out.println("Set doesnt contain Agra");  
		  }
		  
		  System.out.println("updated set is "+ hs);
		  
		  }

}
