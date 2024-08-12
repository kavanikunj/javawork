package javaprogram;

public class oo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str = "Sun rises in East";
		String s = "hello";
		String s1 = "hello";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toCharArray());
		System.out.println(str.indexOf('r'));
		System.out.println(str.charAt(10));
		System.out.println(str.substring(4,11));
		System.out.println(str.replace('i', 'Y'));
		System.out.println(str.concat("Hello"));
		System.out.println(str.equals(s1));
		System.out.println(str.equals(s1));
		
		
	
	    String ar[] = str.split("");
	    for (int i = 0; i < ar.length; i++) {
	    	System.out.println(ar[i]);
	    }

      byte b[] = str.getBytes();
      for (int i = 0; i < ar.length; i++) {
    	  System.out.println(b[i]);
      
      }
	}
}
      
      
      
      
      
      
      
      
