/*
K L M N O
    G H I J
       D E F
          B C
            A
*/
class Counter76
{
	public static void main(String []args)
	{
		int n = 5;
		int count = (n*(n-1))/2+1;
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=i;j>1;j--)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64)+" ");
				c++;
			}
			System.out.println();
			count -=n-i;			
		}
	}

}