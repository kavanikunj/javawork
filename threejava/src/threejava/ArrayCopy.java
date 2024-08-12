package threejava;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originalArray = {1, 2, 3, 4, 5};

        int[] newArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        System.out.print("Original array: ");
        for (int element : originalArray) {
            System.out.print(element + " ");
        }
        System.out.println();
      
        System.out.print("New array: ");
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
		
	}

}
