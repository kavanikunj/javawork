package basic;

import java.util.Scanner;

public class exmple_011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		  Scanner sc = new  Scanner(System.in);
		    System.out.print("plese enter your age : ");
		   int age = sc.nextInt();
		  
		 
			// int age = 18;
			 if(age<18)
			 {
				 System.out.print("you are not eligible for vote");
			 }
		
			 else
			 {
				 System.out.print("you are eligible for vote"); 
			 }
	    
	}
}
	


