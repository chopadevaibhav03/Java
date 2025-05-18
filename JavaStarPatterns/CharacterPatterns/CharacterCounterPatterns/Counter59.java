/*
O M J F A
N K G B
L H C
I D
E
*/
class Counter59
{
	public static void main(String []args)
	{
		int n = 5;
		int count = (n*(n+1))/2;
		for(int i=n;i>=1;i--)
		{
			int c = count;
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(c+64)+" ");
				c -=j;
			}
			System.out.println();
			count -=i-1;
		}
	}
}