/*
				11
			12	7
		13	8	4
	14	9	5	2
15	10	6	3	1	
*/

class Counter43
{
	public static void main(String []args)
	{		
		int n = 5;
		int count = (n*(n-1))/2+1;
		
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=n; j>i;j--)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+"\t");
				c -= n-j+1;
			}
			System.out.println();
			count ++;
		}
	}
}