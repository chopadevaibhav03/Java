/*
5       9       12      14      15
4       7       9       10
3       5       6
2       3
1

*/
class Counter18
{
	public static void main(String []args)
	{
		int n = 5;
		int count = n;
		for(int i=n;i>=1;i--)
		{
			int c = count;	
			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c +=j-1;
			}
			System.out.println();
			count --;
		}
	}
}