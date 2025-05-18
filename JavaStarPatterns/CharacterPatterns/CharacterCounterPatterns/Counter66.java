/*
          E
        D I
     C H L
  B G K N
A F J M O

*/
class Counter66
{
	public static void main(String []args)
	{
		int n = 5;
		int count = n;
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(c+64)+" ");
				c +=n-j+1;				
			}
			System.out.println();
			count --;
		}
	}
}