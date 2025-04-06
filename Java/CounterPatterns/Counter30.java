/*
5	9	12	14	15
	4	8	11	13
		3	7	10
			2	6
				1
*/
class Counter30
{
	public static void main(String []agrs)
	{
		int n = 5;
		int count = n;
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+"\t");
				c +=n-j;
			}
			System.out.println();
			count --;
		}
	}
}