/*
				15
			10	14
		6	9	13
	3	5	8	12
1	2	4	7	11
*/
class Counter46
{
	public static void main(String []args)
	{
		int n=5;
		int count = (n*(n+1))/2;
		for(int i=1;i<=n;i++)
		{
			int c = count ;
			for(int j=i;j<n;j++)
			{
				System.out.print("\t");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c +=n-j+1;
			}
			System.out.println();
			count -=n-i+1;
		}
	}
}