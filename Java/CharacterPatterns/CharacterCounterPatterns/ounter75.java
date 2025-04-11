/*
E D C B A
   I H G F
      L K J
        N M
           O
*/
class Counter75
{
	public static void main(String []args)
	{
		int n = 5;
		int count = n;
		for(int i=n;i>=1;i--)
		{
			int c = count;
			for(int j=i;i<n;i++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64)+" ");
				c--;
			}
			System.out.println();
			count +=i;			
		}
	}
}