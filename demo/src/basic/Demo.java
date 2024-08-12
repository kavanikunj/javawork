package basic;

 class y{
	 
	 public void print()
	 {
		System.out.println("Printing...class y");
	 }
 }
 
 class Z extends y {
	 public void print()
	 {
		 System.out.println("Pring...class z");
	 }
 }


public class Demo {
	public static void main(String[] args) {
		
		Z z = new Z();
		z.print();
		
	}		
	
}
	
	
	
	