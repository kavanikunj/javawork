package threejava;

public class String_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "Hello";
	        String str2 = "World";
        
	        if (str1.equals(str2)) {
	            System.out.println("The strings are equal.");
	        } else {
	            System.out.println("The strings are not equal.");
	        }
       
	        int result = str1.compareTo(str2);

	        if (result == 0) {
	            System.out.println("The strings are equal.");
	        } else if (result < 0) {
	            System.out.println("String 1 is less than String 2.");
	        } else {
	            System.out.println("String 1 is greater than String 2.");
	        }
		
		
	}

}
