/*
54321
  5432
    543
      54
        5
*/
class Pattern38
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j < i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n ; j >= i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}