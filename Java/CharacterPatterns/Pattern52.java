/*
ABCDE
ABCD
ABC
AB
A
*/
class Pattern52
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}