/*
AAAAA
  BBBB
   CCC
     DD
       E
*/
class Pattern46
{
	public static void main(String []args)
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}