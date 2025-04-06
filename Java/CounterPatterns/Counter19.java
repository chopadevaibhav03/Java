/*
11      7       4       2       1
12      9       7       6
13      11      10
14      13
15
*/

class Counter19
{
	public static void main(String []args)
	{
		int n=5;
		int count = (n*(n-1))/2+1;
		
		for(int i=n;i>=1;i--)
		{
			int c = count;	
			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c -=j-1;
			}
			System.out.println();	
			count++;
		}
	}
}
