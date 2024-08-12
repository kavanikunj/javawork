package threejava;
 
 import java.io.InterruptedIOException;

 class th1 implements Runnable{
	 public void run() {
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedIOException e) {
		      e.printStackTrace();
			}
			System.out.println("T1 : "+i);
		 
	 }
 }

	 class th2 implements Runnable{
		 public void run() {
				for(int i=1;i<=10;i++)
				{
					try {
						Thread.sleep(2000);
						
					} catch (InterruptedIOException e) {
				      e.printStackTrace();
					}
					System.out.println("T2 : "+i);
				 
			 }
		 }

public class ex_01 {
      public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	  
    	  th1 t1 = new th1();
    	  th2 t2 = new th2();
    	  
    	  Thread th1 = new Thread(t1);
    	  Thread th2 = new Thread(t2);
      
      }
}
	 
	 }	 
 
	 

   


