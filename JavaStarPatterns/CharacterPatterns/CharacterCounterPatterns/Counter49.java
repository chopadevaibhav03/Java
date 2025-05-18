/*
ABCDE
FGHI
JKL
MN
O
*/
class Counter49
{
	public static void main(String []args)
	{
		int n = 5;
		int count = 1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(count+64));
				count ++;
			}
			System.out.println();
			
		}
	}
}