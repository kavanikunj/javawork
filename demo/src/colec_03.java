
import java.util
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class colec_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
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
