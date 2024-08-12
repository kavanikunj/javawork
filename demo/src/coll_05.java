import java.util.ArrayList;
import java.util.Iterator;

public class coll_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("java");
		al1.add("php");
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("Hello");
		a1.add(25.36);
		a1.add('A');
		a1.addAll(al1);
	    
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
