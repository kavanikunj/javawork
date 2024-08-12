import java.util.ArrayList;
import java.util.Iterator;

public class coolection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("php");
		a1.add("android");
		a1.add("ios");
		a1.add("java");
		
		//a1.add(1,"node");
		//a1.add(1, "Node");
		//a1.remove(4);
		
			
		//System.out.println(a1.get(1));
		
		System.out.println(a1.size());
		
		
	   //	for (String s : a1)
	//	{
	//		System.out.println(s);
	//	}
		
		Iterator<String> itr = a1.iterator();
		
		while(itr.hasNext())
		
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
	}

}
