/*
15      10      6       3       1
14      10      7       5
12      9       7
9       7
5
*/
class Counter23
{
	public static void main(String []args)
	{
		int n=5;
		int count = (n*(n+1))/2;
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=n;j>=i;j--)
			{
				System.out.print(c+"\t");
				c -=j-i+1;
			}
			System.out.println();
			count  -=i;
		}
	}
}