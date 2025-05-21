class RelienceMobile
{
//	private SimCard r = new RelienceSimCard();
 	private SimCard r = new AirtailSimCard();
// 	private SimCard r = new IdiaSimCard();
	
	RelienceMobile()
	{
		startMobile();
		r.startSimCard();
	}

	private void startMobile()
	{
		System.out.println("Wellcome to Relince Mobile!!");
	}
	
}