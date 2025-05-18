/*
				1
			2	6
		3	7	10
	4	8	11	13
5	9	12	14	15

*/

class Counter41
{
	public static void main(String []args)
	{
		int n=5;
		int count = 1;
		for(int i=n;i>=1;i--)
		{
			int c = count;	
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(c+"\t");
				c +=n-j;
			}
			System.out.println();
			count ++;
		}
	}
}