/*
A F J M O
  B G K N
     C H L
        D I
          E
*/
class Counter77
{
	public static void main(String []args)
	{
		int n = 5;
		int count = 1;
		for(int i=n;i>=1;i--)
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
			count ++;

		}
	}
}