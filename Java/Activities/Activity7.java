package activities;

interface BicycleParts {
    public int gears = 0;
    public int currentSpeed = 0;
}

interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}


class Bicycle implements BicycleParts, BicycleOperations{
	public int gears;
    public int currentSpeed;
    
    Bicycle(int gears, int currentSpeed){
    	this.gears= gears;
    	this.currentSpeed=currentSpeed;
    }
    
   public void applyBrake(int decrement) {
	   currentSpeed= currentSpeed - decrement;
	   
	   System.out.println("speek after break "+ currentSpeed);
   }
	
   public void speedUp(int increment) {
	   currentSpeed= currentSpeed + increment;
	   System.out.println("speek after speedup "+ currentSpeed);
   }
   
   public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
}


class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int gears, int currentSpeed,int height){
		super(gears, currentSpeed);
		seatHeight = height;
	}
	
	public void setHeight(int value) {
		seatHeight=value;
	
	}
	
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "Seat height is " + seatHeight);
    } 
}

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MountainBike bike= new MountainBike(3, 30, 5);
		System.out.println(bike.bicycleDesc());
		bike.speedUp(50);
		System.out.println("after speed up " + bike.bicycleDesc());
		bike.applyBrake(20);
		System.out.println("after break " + bike.bicycleDesc());

	}

}
