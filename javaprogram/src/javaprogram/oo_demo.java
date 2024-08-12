package javaprogram;

public class oo_demo {

	//String literal
	//String name = "Om";
	//by object
	//String str = new String("Tejas");
	
	//String nname = name.concat("Kava");
	
	//System.out.println(nname);
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = new String("java");
        String s2 = new  String("Kava");
        String s3 = new  String("java");
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
        
        System.out.println("****************************************");
        
        String st1 = "java";
        String st2 = "Kava";
        String st3 = "java";
        
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1 == st3);
        
        
        
		
	}

}
