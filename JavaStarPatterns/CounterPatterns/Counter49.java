/*
ABCDE
FGHI
JKL
MN
O
*/
class Counter49
{
	public static void main(Stirng []args)
	{
		int n = 5;
		int count = 1;
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=i;j<=i;j++)
			{
				System.out.print((char)(c));
				c +=j;
			}
			System.out.println();
			count +=i;
		}
	}
}