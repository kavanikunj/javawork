
public class execeptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 int result = 10/0;
        	 System.out.print("Result: "+ result);
        	 
         } catch (ArithmeticException e) {
        	 
        	 System.out.print("Error: Cannot divide by zero."); 
         } finally {
        	 System.out.print("Finally block executed."); 
         }
	}
 }
