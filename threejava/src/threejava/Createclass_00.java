package threejava;

    abstract class Parent {
    abstract void message();
    }

    class FirstSubclass extends Parent {
    
    void message() {
        System.out.println("This is first subclass");
    }
}

     class SecondSubclass extends Parent {
     
    void message() {
        System.out.println("This is second subclass");
    }
}

public class Createclass_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent first = new FirstSubclass();
        first.message();

        Parent second = new SecondSubclass();
        second.message();
		
	}

}
