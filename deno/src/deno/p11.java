package deno;

import java.util.Arrays;

class Calc {
	  public void display()
	  {
		  System.out.println("Ranning display...");
	  }
    
     public void mesaage(String name)
     {
    	 System.out.print("Hiii..."+name);
     }
    
      public void add(int a, int b)
      {
    	  System.out.print("Addition is : "+(a+b));
      }
      
      public int square(int a)
      {
    	  int sq = a*a;
    	  return sq;
      }
      
      public String data()
      {
    	  return "Hello";
      }
              
      
      public void arrayAdd(int a[])
      {
    	  int sum = 0;
    	  for (int i=0; i <a.length; i++) {
    		  sum = sum +a[i];
    	  }	  
    	    System.out.println("sum :"+sum);
      }
      

    
      public int [] revArray(int a []) {
    	  int b[] = new int[a.length];
    	  int count = 0;
    	  for(int i=a.length-1;i>=0;i--)
    	  {
    		  b[count] = a[i];
    		  count++;
    	  }
           return b;
      }
      
      public void all(int...a) {
    	  
    	  for (int i = 0; i< a.length; i++) {
    		   System.out.println(a[i]);
    	  }
      }	  
    	  
    	 
public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		  Calc c = new Calc();
		  c.display();
		  c.mesaage("nikunj");
		  c.add(10,20);
		  
	      int sq = c.square(10);
	      System.out.println(sq);
	      System.out.println(c.square(50));
	      
          String r= c.data();
          System.out.println(r);
          
          int r1 = c.square(20);
          c.add(20, r1);
	      
          int a[] = {10,20,30,40,50};
          int b[] = {1,2,3,4,5,60};
         // c.arrayAdd(a);
         // c.arrayAdd(b);
          
          int r11[] = c.revArray(b);
          System.out.println(Arrays.toString(r11));
        		  
	      c.all(10,20,30,60,70);
	
	}
}
}

  
    
	


