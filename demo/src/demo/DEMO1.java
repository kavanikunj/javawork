package demo;

 class Animal {
	 void eat() {
		 System.out.println("This animal eats food.");
	 }
 }

  class Dog extends Animal {
	  void bark() {
		  System.out.println("The dog barks.");
	  }
  }

public class DEMO1 {
	public static void main(String[] args) {
	     Dog myDog = new Dog();
	     
	     myDog.bark();
	     myDog.eat();
	}

}
