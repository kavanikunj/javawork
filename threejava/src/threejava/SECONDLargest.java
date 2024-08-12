package threejava;

public class SECONDLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 5, 1, 4, 2, 8, 7};

        int secondLargest = findSecondLargest(array);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("The array does not have enough elements to determine the second largest element.");
        }
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        return secondLargest;
		
	}

}
