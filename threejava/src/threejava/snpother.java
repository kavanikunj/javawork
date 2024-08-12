package threejava;

 import java.io.File;
 import java.io.IOException;

public class snpother {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
         
		File file = new File("C:\\Users\\NEHAL\\Downloads\\book\\test.txt");
		 
		if(file.exists())
		{
			System.out.println("file exists...");
		    file.delete();
		}    
		else
		{
			System.out.println("file is not exists...");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
}		 