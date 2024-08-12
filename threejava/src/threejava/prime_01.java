package threejava;

public class prime_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=3;j<=100;j++)
		{
		
			int num = j;
			int flag = 0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag = 1;
					break;
				}
			}
			
			if(flag==0)
			{
				System.out.println(num+" : Prime");
			}
			else
			{
				System.out.println(num+ ": not Prime");
			}		
		}
		
	}

}
