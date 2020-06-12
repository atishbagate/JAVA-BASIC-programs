class Bike_showRoom
{

	String showRoom_company = "bullet";
	String showRoom_Name = "bike garadge";
	int numOfService = 123;

	public void customerView()
	{
		System.out.println("showRoom has good service");
	}
}

class Sub_Bike_showRoom extends Bike_showRoom
{
	String showRoom_company = "pulsure";
	String showRoom_Name = "bike garadge 2";

	int numOfService = 231;

	public void customerView()
	{
		System.out.println("showRoom has good service");
	}

	public void customerSatisfaction()
	{
		System.out.println("customer is 100 percent satisfied");
	}
}

class review_officer
{
	public static void main(String[] args) {
		System.out.println("review_officer come");

	 Bike_showRoom b1	=  new Bike_showRoom();

	 System.out.println("showRoom_company "+b1.showRoom_company);
	 System.out.println("showRoom_Name "+b1.showRoom_Name);
	 System.out.println("number of services = "+b1.numOfService);
	 b1.customerView();


	Sub_Bike_showRoom s1  = new Sub_Bike_showRoom();

	 System.out.println("showRoom_company "+s1.showRoom_company);
	 System.out.println("showRoom_Name "+s1.showRoom_Name);
	 System.out.println("number of services = "+s1.numOfService);
	 s1.customerSatisfaction();
	 s1.customerView();



		System.out.println("review_officer goes");
		return;
	}
}