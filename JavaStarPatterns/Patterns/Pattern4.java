class Pattern4
{
	public static void main(String []args)
	{
		int n = 10;
		for(int l = 1; l <= n ; l++)
		{
			for(int k = 1; k<=n; k++)
			{
				for(int j = 1; j<= n; j++)
				{
					for(int i=1;i<=n;i++)
					{
						System.out.print("*");
					}
						System.out.print("\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}