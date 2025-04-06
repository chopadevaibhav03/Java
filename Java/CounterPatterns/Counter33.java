/*
1	2	4	7	11
	3	5	8	12
		6	9	13
			10	14
				15
*/
class Counter33
{
	public static void main(String []args)
	{
		int n=15;
		int count = 1;
		for(int i=n;i>=1;i--)
		{
			int c = count;
			for(int  j=i;j<n;j++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+"\t");
				c +=j;
			}
			System.out.println();	
			count += n - i + 2;
		}
		
	}
}