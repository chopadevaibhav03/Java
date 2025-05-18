class Pattern25
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=n;i>=1;i--) // i>=1
						   //5>=1	
		{
			for(int j=i;j>1;j--) 
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) // j<=n
							// 5<=5 
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}