package basic;

 class p {
	public void print()
	{
		System.out.println("Printing...class p");
	}
 	
 }
 
 class Q extends p
 {
	 public void print() {
		 System.out.println("Pring...class Q");
	 }
 }

 
 public class oo_p20
 {
 public static void main(String[] args) 
 {
		// TODO Auto-generated method stub
          Q q = new Q();
          q.print();
	}

}

