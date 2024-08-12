package threejava;

import java.util.ArrayList;


public class REMOVE_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");

        System.out.println("Original list: " + list);

        if (list.size() >= 3) {
            list.remove(2);
            
        } else {
            System.out.println("The list does not have a third element.");
        }

        System.out.println("Updated list: " + list);
		
	}

}
