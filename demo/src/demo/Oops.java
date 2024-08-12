package demo;
 
 class Car{
	 String color;
   String model;
     int year;
    
   void displayDetails() {
	   System.out.println("Car model: "+ model);
	   System.out.println("Car color: "+ color);
	   System.out.println("Car year: "+ year);
    
   }

   }
   

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
	   Car car1 = new Car();
	   
	   car1.color = "Red";
	   car1.model = "Toyota";
	   car1.year = 2020;
	   
	   Car car2 = new Car();
	   car2.color = "Blue";
	   car2.model = "Honda";
	   car2.year = 2023;
	   
	   car1.displayDetails();
	   car2.displayDetails();
	}
	
}	
	   
	   


