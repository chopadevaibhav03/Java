/*
EDCBA
IHGF
LKJ
NM
O
*/
class Counter51
{
	public static void main(String []agrs)
	{
		int n = 5;
		int count  = n;
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(c + 64));
				c --;
			}
			System.out.println();
			count +=n-i;
		}
	}
}