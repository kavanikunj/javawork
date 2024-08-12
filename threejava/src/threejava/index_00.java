package threejava;

public class index_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {10, 20, 30, 40, 50};
	        int target = 30; 
	        int index = -1;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println("The index of element " + target + " is: " + index);
	        } else {
	            System.out.println("Element " + target + " is not in the array.");
	        }
		
	}

}
