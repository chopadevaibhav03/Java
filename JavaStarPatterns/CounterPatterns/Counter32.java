/*
11	7	4	2	1
	12	8	5	3
		13	9	6
			14	10
				15
*/
class Counter32 
{
    public static void main(String[] args) 
	{
     	  	int n = 5;    
        	int count = (n * (n - 1)) / 2 + 1;
		
		for(int i=n;i>=1;i--)
		{
			int c = count;
			for(int j=i;j<n;j++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+"\t");
				c -= n-j;
			}
			System.out.println();
			count ++;
		}
       	
    	}
}
