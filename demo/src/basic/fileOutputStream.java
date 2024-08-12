package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public record fileOutputStream() {
       public static void main(String[] args) {
    	   
    	   try {
    		   
    		   FileInputStream fis = new FileInputStream("C:\\Users\\NEHAL\\Downloads\\book\\test.txt"); 
    		   
    		   int i = fis.read();
    		   
    		   while(i != -1)
    		   {
    			   char c = (char) i;
    			   System.out.print(c);
    			   i = fis.read();
    		   }
    		   
    		   
    	   } catch (IOException e) {
    	      
    	      e.printStackTrace();
    	   }
       }
}
       
       
       

