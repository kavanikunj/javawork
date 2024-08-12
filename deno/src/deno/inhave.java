package deno;

 class A{
	 int id =10;
	 public void dispaly()
	 {
		 System.out.println("runing display");
	 }
 }
 
 class B extends A
 {
	 int id =50;
	 
	 public void show()
	 {
		 int id = 100;
		 System.out.println("id : "+id);
		 System.out.println("id : "+this.id);
		 System.out.println("id : "+super.id);
		 System.out.println("runing show");
	 }
 }
 
	 
 
 

public class inhave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           B b = new B();
           b.show();
	}

}
