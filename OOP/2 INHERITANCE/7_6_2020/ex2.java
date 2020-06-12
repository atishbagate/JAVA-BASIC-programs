/*ex2 single */

class EOS_300d
{
	String brand = "CANON";
	double price = 22.999;
	String sensor = "CMOS";
	int mp = 18;
	String lense_size = "1080 * 1920";
	String can_record = "720 pix";
	String model = "EOS_300d";

	public void fps()
	{
		System.out.println("camera model "+model+ "has fps and capture. 60 fps");
	}

}

class EOS_600d extends EOS_300d 
{
	String brand = "CANON";
	double price = 28.999;
	String sensor = "MIRROR LESS";
	int mp = 24;
	String lense_size = "1080 * 1920";
	String can_record = "720 pix";
	String model = "EOS_300d";

	public void fps()
	{
		System.out.println("camera model "+model+ "has fps and capture. 72 fps");
	}

	public void wifi()
	{
		System.out.println("camera model "+model+ "has wifi port. ");
	}

	public void nfc()
	{
		System.out.println("camera model "+model+ "has nfc port. ");
	}

}
class info_of_camera
{
	public static void main(String[] args) 
	{	
		System.out.println("-----------------------");
		System.out.println("info_of_camera starts");

		EOS_300d cam1 = new EOS_300d();

		System.out.println("info_of_camera ends");
		System.out.println("-----------------------");

		System.out.println("name of camera is "+cam1.model+ "and brand is "+cam1.brand+ "having a price is "+cam1.price+ "having sensors "+cam1.sensor);
		System.out.println("it has "+cam1.mp+ " lense size is "+cam1.lense_size+ " and can record "+cam1.can_record);
		cam1.fps();

		System.out.println("-----------------------");

		EOS_600d cam2 = new EOS_600d();
		System.out.println("info_of_camera inherited starts");

		System.out.println("name of camera is "+cam2.model+ "and brand is "+cam2.brand+ "having a price is "+cam2.price+ "having sensors "+cam2.sensor);
		System.out.println("it has "+cam2.mp+ " lense size is "+cam2.lense_size+ " and can record "+cam2.can_record);
		cam2.fps();
		cam2.wifi();
		cam2.nfc();



		System.out.println("info_of_camera inherited ends");
		System.out.println("-----------------------");
		return ;	


	}
}