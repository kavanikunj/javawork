package threejava;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 2, 3, 4, 5};

	        System.out.print("Original array: ");
	        for (int element : array) {
	            System.out.print(element + " ");
	        }
	        System.out.println();

	        int n = array.length;
	        for (int i = 0; i < n / 2; i++) {
	            int temp = array[i];
	            array[i] = array[n - 1 - i];
	            array[n - 1 - i] = temp;
	        }

	        System.out.print("Reversed array: ");
	        for (int element : array) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
		
	}

}
