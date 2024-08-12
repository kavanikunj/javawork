package threejava;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;

 public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Fig");

        System.out.println("Using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing Java 8 forEach with lambda:");
        list.forEach(fruit -> System.out.println(fruit));	
		
	}

}
