package basic;

 class t1 extends Thread
 {
	 public void run()
	 {
		for(int i=1;i<=10;i++)
		{   
			try {
				sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t1: "+i);
			
		}
		 
		 
	 }
 }

 class t2 extends Thread
 {
	 public void run()
	 {
		for(int i=1;i<=10;i++)
		{  
			try {
				sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t2: "+i);
			
		}
		 
		 
	 }
 }



public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		 t1 t1 = new t1();
		 t2 t2 = new t2();	
	
	    // t1.run();
	     //t2.run();
	
        t1.start();
        t2.start();
	}	

}
