class Bike{

	String bikeName;
	int    bikeCharseNo;
	int    bikePrice;

	public Bike(String bikeName,int bikeCharseNo,int bikePrice){
       this.bikeName = bikeName;
       this.bikePrice = bikePrice;
       this.bikeCharseNo = bikeCharseNo;
    return;
	}
  
  	public void displayBikeDetails(){
		System.out.println("--------------------------------------");
		System.out.println("bikeName = [ "+this.bikeName+" ]");
	    System.out.println("bikePrice = [ "+bikePrice+" ]");
		System.out.println("bikeCharseNo = [ "+bikeCharseNo+" ]");
		System.out.println("---------------------------------------");
    return;
	}
}

class Showroom{

	public static void main(String[] args) {
		System.out.println("main starts....");

         Bike b1 = new Bike("Puslsar",1234567891,120000);
         b1.displayBikeDetails();

         Bike b2 = new Bike("ktm",1234567342,170000);
         b2.displayBikeDetails();
 
        System.out.println("main ends.....");
        return;
	}
}