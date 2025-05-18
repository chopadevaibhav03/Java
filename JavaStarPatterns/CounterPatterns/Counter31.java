/*
15	10	6	3	1
	14	9	5	2
		13	8	4
			12	7	
				11
*/
class Counter31
{
	public static void main(String []args)
	{
		int n=5;
		int count = (n*(n+1))/2;
		for(int i=n;i>=1;i--)
		{
			int c = count;
			for(int j=n;j>i;j-- )
			{
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+"\t");
				c -=(n-j+1);
			}
			System.out.println();
			count --;
		}
	}
}