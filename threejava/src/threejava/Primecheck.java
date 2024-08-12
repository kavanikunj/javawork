package threejava;

import java.util.Scanner;

public class Primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter a number: ");
		 int number = scanner.nextInt();
		 
		 boolean isprime = true;
		 if (number <= 1) {
			 isprime = false;
		 } else {
		    
		    for (int i = 2; i<= Math.sqrt(number); i++) {
		    	if(number % i== 0) {
		    		isprime = false;
		    		break;
		    		
		    	}
		    }
		
		 }   
		    
		    if(isprime) {
		    	System.out.println(number + " is a prime number.");
		    } else {
		    	System.out.println(number + " is not a prime number.");
		    }
		
		     scanner.close();	
		 }
	}


