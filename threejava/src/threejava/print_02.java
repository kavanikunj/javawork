package threejava;

public class print_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int lines = 5;
		int startcount = 1;
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startcount;i++)
			{
				System.out.print((i+j)%2);
			}
			System.out.println();
			startcount++;
		}
	}
}
