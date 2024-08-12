package basic;

 class bank {
	 
      double a;
	 public void Getbalnce()
	 { 
		 System.out.print(a);
	 }
  
     public void Dipsoit(double amt)
     {
    	 a=a+amt;
     }
    
     public void witdraw(double amt1)
     {
    	 a=a-amt1;
     }
    
     
public class exmple_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		bank bank = new bank();
		
		bank.Getbalnce();
		bank.witdraw(0);
		bank.Dipsoit(0);
		
		
	}

}
}