package deno;

public class armstrong {
	public static void main(String[] args) {
		for (int i = 1; i <= 999; i++) {

			int num = i;

			int temp = num;
			int sum = 0;

			while (num != 0) {
				int rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num / 10;
			}
			if (temp == sum) {
				System.out.println(temp+"temp is armstrong");
			} else {
				//System.out.println("temp is not armstrong");
			}

		}
	}

}
