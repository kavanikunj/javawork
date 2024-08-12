package demo;

 class Person{
	 
	 String name;
	 int age;
	 
	 public Person(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 
	 void displayDetails() {
		 System.out.println("Name: "+ name);
		 System.out.println("Age: "+ age);
	 }
 }

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Person1 = new Person("Alice", 30);
		Person Person2 = new Person("om", 20);
		Person1.displayDetails();
		Person2.displayDetails();		
	}

}
