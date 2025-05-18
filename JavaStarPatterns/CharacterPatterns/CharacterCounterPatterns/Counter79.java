/*
O J F C A
   N I E B
     M H D
        L G
           K
*/
class Counter79
{
	public static void main(String []args)
	{
		int n = 5;
		int count = (n*(n+1))/2;;
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
				c -=n-j+1;
			}
			System.out.println();
			count --;
		}
	}
}