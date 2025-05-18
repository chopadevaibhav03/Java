// WAM to append the sum of digits at the end of number

class NumberSum
{
	int appendSumLast(int n)
	{
		int sum = 0, temp = n;
		while(temp !=0)
		{
			sum +=temp%10;
			temp /= 10;
		}
		if(sum > 9)
			n*=100;
		else
			n*=10;
		n+=sum;
		return n;
	}

// WAM to append the sum of digits at the first of number.
	int appendSumFisrt(int n)
	{
		int sum= 0, temp = n , length=1;
		while (temp !=0)
		{
			sum +=temp%10;
			temp /=10;
			length *=10;
		}
		sum*=length;
		n+= sum;
		return n;
	}
}
class AppendSumOfDigit
{
	public static void main(String []args)
	{
		NumberSum s = new NumberSum();	
		System.out.println("sum append at the last " +" = "+ s.appendSumLast(12345));
		System.out.println("sum append at first position "+" = "+ s. appendSumFisrt(54321));
	}
}