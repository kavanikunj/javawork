package threejava;

public class MyThread extends Thread {
  
	 public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Running in thread: " + Thread.currentThread().getId() + " - Count: " + i);
	            try {
	                Thread.sleep(1000); 
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted: " + e);
	            }
	        }
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 MyThread thread = new MyThread();
		
		 thread.start();   
         
		 System.out.println("Main thread is running: " + Thread.currentThread().getId());
		
	}

}
