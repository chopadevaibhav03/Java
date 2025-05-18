/*
AAAAA
BBBB
CCC
DD
E
*/
class Pattern44
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}