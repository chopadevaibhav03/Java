/*
E	I	L	N	O
D	H	K	M
C	G	J
B	F
A
*/
class Counter54
{
	public static void main(String []args)
	{
		int n= 5;
		int count = n;
		for(int i=1;i<=n;i++)
		{
			int c = count;
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64));
				c +=n-j;
			}
			System.out.println();
			count --;
		}
		
	}
}