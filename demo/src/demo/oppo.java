package demo;

class n{
	public void animal()
	{
		System.out.println("This animal vary good.");
	}
}

 class M extends n{
	 public void animal()
	 {
		 System.out.println("The animal very beautiful.");
	 }
 }

public class oppo {

	public static void main(String[] args) {
		System.out.println("hello java");
		  
		M m = new M();
		m.animal();
		

	}

}
