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
		op.display(); //10 20

		new Operation().a=10;
		new Operation().b = 20;
		new Operation().display();

		op.a=11;
		
	}
}
