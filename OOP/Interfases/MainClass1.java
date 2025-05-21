class MainClass1
{
	public static void main(String []args)
	{
		Car c = new HondaCar();
		c.color();
		c.type();
		c.power();

		System.out.println();
		Car c1 = new BMWCar();
		c1.color();
		c1.type();
		c1.power();

		System.out.println();
		Car c2 = new ForceCar();
		c2.color();
		c2.type();
		c2.power();
System.out.println();


		System.out.println("This how we can achieve multiple inheritance by using interfaces");

		
	}
}