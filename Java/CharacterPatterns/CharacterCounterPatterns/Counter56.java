/*
K G D B A
L H E C
M I F
N J
O
*/
class Counter56
{
	public static void main(String []args)
	{
		int n= 5;
		int count = (n*(n-1))/2+1;
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64)+" ");
				c -=n-j;
			}
			System.out.println();
			count ++;
		}
	}
}	