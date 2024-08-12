package threejava;

public class demonstrate_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		try {
            
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing the fourth element: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Exception caught: " + e);
            System.out.println("Array index is out of bounds.");
        }

        System.out.println("Rest of the code executes normally.");
		
	}

}
