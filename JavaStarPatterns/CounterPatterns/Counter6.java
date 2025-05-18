/*
5
9	4
12	8	3
14	11	7	2
15	13	12	6	1
*/
class Counter6
{
	public static void main(String []args)
	{
		int n=5;
		int count = n;
		for(int i=n;i>=1;i--)
		{
			int c = count;
			for(int j=n;j>=i;j--)
			{
				System.out.print(c+"\t");
				c -=j;
			}
			System.out.println();
			count +=i-1;
		}
	}
}