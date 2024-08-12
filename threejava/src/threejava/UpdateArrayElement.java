package threejava;

public class UpdateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, 30, 40, 50};

        int indexToUpdate = 2; 
        int newValue = 100;    

        System.out.println("Original array:");
        printArray(array);

        if (indexToUpdate >= 0 && indexToUpdate < array.length) {
            array[indexToUpdate] = newValue;
            System.out.println("Array after updating index " + indexToUpdate + " to value " + newValue + ":");
            printArray(array);
        } else {
            System.out.println("Index " + indexToUpdate + " is out of bounds.");
        }
	}	
		
	public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();	
	}

}
