package demo;
 class Detail { 
 
	 String name;
	 int age;
	 String address;
	 
	 void introduce() {
		 System.out.print("Hello, my name is "+ name + ".");
		 System.out.print("I am "+ age + "yaer old.");
		 System.out.print("I live at"+ address + ".");
	 }
 }



public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Detail detail1 = new Detail();
           
          detail1.name = "jay";
          detail1.age = 22;
          detail1.address = "10 Elm St, Springfield";
          
          Detail detail2 = new Detail();
          
          detail2.name = "Nikunj";
          detail2.age = 21;
          detail2.address = "45 Elm St, Springfield";
          
          detail1.introduce();
          detail2.introduce();

	}
	  
}	
	
	
	
	
	
	
	
	