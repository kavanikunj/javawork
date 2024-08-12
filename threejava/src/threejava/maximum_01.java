package threejava;

public class maximum_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {10, 20, 3, 40, 5, -1, 100};
       
	        int max = array[0];
	        int min = array[0];  
   
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }

	        System.out.println("The maximum value in the array is: " + max);
	        System.out.println("The minimum value in the array is: " + min);
		
	}

}
