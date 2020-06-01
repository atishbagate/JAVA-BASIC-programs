class Car
{

	/*
     Father    -> tata 
     Mother    -> mahindra
     son       -> jaguar
     daughter  -> nano
	*/

   static boolean mumbai ;
   boolean kolkata ;
   static boolean delhi  ;
   static boolean pune ;
   boolean chennai ;


   public void showCarStatus()
   {
   	System.out.println("showCarStatus starts");

   	System.out.println("        mumbai has showroom ? "+mumbai);
   	System.out.println("        kolkata has showroom ? "+kolkata);
   	System.out.println("        delhi has showroom ? "+delhi);
   	System.out.println("        pune has showroom ? "+pune);
   	System.out.println("        chennai  has showroom ?"+chennai);

   	return;
   }

   public static void setMumbaiShowroomStatus(boolean open)
   {
   	System.out.println("setMumbaiShowroomStatus starts");

   	mumbai = open;
   	System.out.println("setMumbaiShowroomStatus ends");
   	return;
   }

   public static void setkolkataShowroomStatus(boolean open)
   {
   	System.out.println("setkolkataShowroomStatus starts");
   	kolkata = open;
   	System.out.println("setkolkataShowroomStatus ends");
   	return;
   }

    public static void setdelhiShowroomStatus(boolean open)
   {
   	System.out.println("setdelhiShowroomStatus starts");
   	delhi = open;
   	System.out.println("setdelhiShowroomStatus ends");
   	return;
   }

    public void setpuneShowroomStatus(boolean open)
   {
   	System.out.println("setpuneShowroomStatus starts");
   	pune = open;
   	System.out.println("setpuneShowroomStatus ends");
   	return;
   }

     public void setchennaiShowroomStatus(boolean open)
   {
   	System.out.println("setchennaiShowroomStatus starts");
   	chennai = open;
   	System.out.println("setchennaiShowroomStatus ends");
   	return;
   }


class ShowRoom
{
	public static void main(String[] args) 
	{
	System.out.println("main starts...");

	Car tata = new Car();
	Car mahindra = new Car();
	Car jaguar = new Car();
	Car nano = new Car();

	tata.setchennaiShowroomStatus(true);
	tata.showCarStatus();



	System.out.println("main ends..");	
	return;
	}
}
}