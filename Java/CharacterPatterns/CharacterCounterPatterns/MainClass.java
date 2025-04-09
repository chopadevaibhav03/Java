class Demo
{
	int Number(int a,int b)
	{
		return a+b;
	}
}
class MainClass
{
	public static void main(String []args)
	{
		Demo d1 = new Demo();
		System.out.println(d1.Number(10,20));
		
	}
}