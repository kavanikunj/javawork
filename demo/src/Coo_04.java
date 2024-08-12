
 import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Coo_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "java");
		map.put(20, "php");
		map.put(30, "android");
		map.put(10, "node");
		
		System.out.println(map.get(30));
		
		System.out.println(map);
		
		Set s  = map.entrySet();
				
		Iterator itr = s.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		
			
		
	}

}
