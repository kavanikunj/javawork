
public class impclass_1 {
     public static void main(String[] args) {
    	 //syncronised
    	 double starTime = System.currentTimeMillis();
    	 StringBuffer sb = new StringBuffer("Hello");
    	 for(int i=1;i<=100000;i++)
    	 {
    		 sb.append("java");
    	 }
    	 //System.out.println(sb);
         double endTime = System.currentTimeMillis();
         
         //asyncronised
         double starTime1 = System.currentTimeMillis();
         StringBuffer sb1 = new StringBuffer("Hello");
         for(int i=1;i<=100000;i++)
         {
        	 sb1.append("java");
         }
         
         double endTime1 = System.currentTimeMillis();
         //System.out.println(sb1);
         
         //System.out.println("time takne by buffer : "+(endTime-starTime));
         //System.out.println("time takn by builder : "+(endTime-starTime));
     
         
         
         System.out.println(System.currentTimeMillis());
         
     }
}
     
     
     
     
     
     
     
