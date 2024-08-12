package demo;

  class Vehicle{
	  int speed;
	  int capacity;
   
   void start() {
	   System.out.println("Vehicle is starting.");
   }
   
	   void stop(){
		   System.out.println("Vehicle is stopping.");
	   }
	   
  }   
	    
  class Bike extends Vehicle {
	  boolean hasCarrier;
	  
	  void disPlayDetails() { 
		  System.out.println("Bike speed: "+ speed + "km/h");
	     System.out.println("Bike capacity: "+ capacity + "person(s)");
	     System.out.println("Does the bike have a carrier? "+ (hasCarrier ? "Yes" : "No"));
	  }
  }
  	  
public class Demo {

	public static void main(String[] args) {
		 Bike myBike = new Bike();
		 
		 myBike.start();
		 myBike.speed = 25;
		 myBike.capacity = 1;
		 myBike.hasCarrier = true;
		 myBike.disPlayDetails();
		 myBike.stop();
		 
	}

}
