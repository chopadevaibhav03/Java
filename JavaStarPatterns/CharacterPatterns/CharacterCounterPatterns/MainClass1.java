class Operation
{
	int a=10,b=20;
	void display()
	{
		System.out.println(a+" "+b+" ");
	}
}
class MainClass1
{
	public static void main(String []args)
	{
		Operation op = new Operation();
		System.out.println(op.display());
		
	}
}
