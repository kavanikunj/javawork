package threejava;

public class demonstrate_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		try {
            
            int[] numbers = {1, 2, 3};
            int result = 10 / 0; 
            
            System.out.println("Accessing the fourth element: " + numbers[3]); // This will cause ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            
            System.out.println("ArithmeticException caught: " + e);
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
            System.out.println("Array index is out of bounds.");
        } catch (Exception e) {
           
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Rest of the code executes normally.");
		
	}

}
