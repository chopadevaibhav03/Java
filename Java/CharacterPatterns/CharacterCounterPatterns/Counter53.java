/*
A	F	J	M	O
B	G	K	N
C	H	L
D	I
E
*/

class Counter53
{
	public static void main(String []args)
	{
		int n = 5;
		int count = 1;
		for(int i=1;i<=n;i++)
		{
			int c = count;	
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(c+64)+" ");
				c +=j;
			}
			System.out.println();
			count ++;
		}
	}
}