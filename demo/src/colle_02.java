
 import java.util.HashSet;
	import java.util.Iterator;
	
	public class colle_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("php");
		set.add("android");
		set.add("node");
		set.add("java");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
					
		}
		
		
		
		
		
		
	}

}
