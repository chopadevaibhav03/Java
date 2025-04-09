class Demo {
    public int findLastDigit(int number)
	{
        	return Math.abs(number % 10);
    	}
    
    public int findSecondLastDigit(int number)
	{
        	number = Math.abs(number);
	        return (number / 10) % 10;
    	}
    
    public int findFirstDigit(int number)
	{
        	number = Math.abs(number);
	        while (number >= 10) {
            	number /= 10;
        }
        return number;
    }
    
    public int findSecondDigit(int number) {
        number = Math.abs(number);
        while (number >= 100) {
            number /= 10;
        }
        return number % 10;
    }
    
    public int findSumOfDigits(int number)
	{
        	number = Math.abs(number);
	        int sum = 0;
        	while (number > 0)
		{
            	sum += number % 10;
            	number /= 10;
	        }
        	return sum;
    	}
    
    public double findAvgOfDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 0.0;
        
        int sum = 0;
        int count = 0;
        int temp = number;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
            count++;
        }
        
        return (double) sum / count;
    }
}

public class MainClass
{
    public static void main(String args[])
	{
        	Demo dl = new Demo();
	        int number = 1234;
        
        	System.out.println(dl.findLastDigit(number));
	        System.out.println(dl.findSecondLastDigit(number));
        	System.out.println(dl.findFirstDigit(number));
	        System.out.println(dl.findSecondDigit(number));
        	System.out.println(dl.findSumOfDigits(number));
	        System.out.println(dl.findAvgOfDigits(number));
    	}
}