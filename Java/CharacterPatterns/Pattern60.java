/*
EDCBA		54321	5>=1 --
EDCB		5432		1<=5 ++ 2
EDC			543		2<=5 ++ 3
ED			54
E			5
*/
class Pattern60
{
	public static void main(String []args)
	{
		int n = 5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}