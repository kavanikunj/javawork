package deno;

import java.util.Scanner;

public class oscaex {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Taking three numbers from the user
		        System.out.println("Enter the first number  : ");
		        int num1 = scanner.nextInt();

		        System.out.println("Enter the second number  : ");
		        int num2 = scanner.nextInt();

		        System.out.println("Enter the third number  : ");
		        int num3 = scanner.nextInt();

		        // Finding the greatest number
		        int greatest;
		        if (num1 >= num2 && num1 >= num3) {
		            greatest = num1;
		        } else if (num2 >= num1 && num2 >= num3) {
		            greatest = num2;
		        } else {
		            greatest = num3;
		        }

		        // Printing the greatest number
		        System.out.println("The greatest number is: " + greatest);
		    }
		

	}


