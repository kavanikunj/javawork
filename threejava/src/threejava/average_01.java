package threejava;

public class average_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array) {
            sum += num;
        }
	
        double average = (double) sum / array.length;

        System.out.println("The average value of the array elements is: " + average);
		
	}

}
