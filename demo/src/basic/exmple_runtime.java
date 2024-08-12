package basic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class exmple_runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter name : ");
		 String name = sc.next();
		 System.out.println("enter email : ");
		 String email = sc.next();
		 
		 
		 FileOutputStream fos = null;
		 
		 try {
			 
			 fos = new FileOutputStream("C:\\Users\\NEHAL\\Downloads\\book\\test.txt");
					 
			String str = "Name: " + name + "\nEmail: " + email;
			 
			byte b [] = str.getBytes();
			
			fos.write(b);
			System.out.print("done..");
			
		 } catch (IOException e) {
			
			e.printStackTrace(); 
		 	 
		 }finally {
			 try {
				 fos.close();
			 }catch (IOException e) {
				 e.printStackTrace();
				 
			 }
		 }
		
		
	} 

}
