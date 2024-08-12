package threejava;

import java.util.Scanner;

public class Marksshit_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their marks
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        displayGrade(marks);

        scanner.close();
    }

    public static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD");
        } else if (marks <= 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks");
        }	
	
	}
}		
		
	


