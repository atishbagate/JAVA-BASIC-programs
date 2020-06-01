class Laptop{
	
	String lModel;
	int    lModelId;
	int    lRamSize;
	int    lRomSize;
	double lPrice;
	String lMFD;
	String lShowRoomId;
	String lCustomerId;

/*
 * This constructor accepts String,int,int,int,double,String,String,String arguments
 */
  public Laptop(String lModel,int lModelId,int lRamSize,
  	int lRomSize,double lPrice,String lMFD,String lShowRoomId,
  	String lCustomerId){ // 1st
      
  this.lModel      = lModel;
	this.lModelId    = lModelId;
	this.lRamSize    = lRamSize;
	this.lRomSize    = lRomSize;
	this.lPrice      = lPrice;
	this.lMFD        = lMFD;
	this.lShowRoomId = lShowRoomId;
	this.lCustomerId = lCustomerId;
	return;
  }

/*
 * This constructor accepts String,int,int,int,double,String arguments
 */
  public Laptop(String lModel,int lModelId,int lRamSize,
    int lRomSize,double lPrice,String lMFD){// 2nd 
  this.lModel      = lModel;
  this.lModelId    = lModelId;
  this.lRamSize    = lRamSize;
  this.lRomSize    = lRomSize;
  this.lPrice      = lPrice;
  this.lMFD        = lMFD;
  return;
  }

/*
 * This constructor accepts String,int,int,int,double,String arguments.
 * Not an overloaded constructor but it is a duplicate of 2nd overloaded constructor.
 */
 /* public Laptop(String lModel,int lRomSize,int lRamSize,
    int lModelId,double lPrice,String lMFD){// 2nd 
  this.lModel      = lModel;
  this.lModelId    = lModelId;
  this.lRamSize    = lRamSize;
  this.lRomSize    = lRomSize;
  this.lPrice      = lPrice;
  this.lMFD        = lMFD;
  return;
  }*/

/*
 * This constructor accepts String,int,double,String arguments
 */
  public Laptop(String lModel,int lModelId,double lPrice,String lMFD){ //3rd
  this.lModel      = lModel;
  this.lModelId    = lModelId;
  this.lPrice      = lPrice;
  this.lMFD        = lMFD;
  return;
  }

  public void displayLaptopDetails(){
  	System.out.println("-------------------------------------------");
  	System.out.println("lModel = "+lModel);
  	System.out.println("lModelId = "+lModelId);
  	System.out.println("lRamSize = "+lRamSize+" GB");
  	System.out.println("lRomSize = "+lRomSize+" GB");
  	System.out.println("lPrice = "+lPrice+" Rs");
    System.out.println("lMFD = "+lMFD);
  	System.out.println("lShowRoomId = "+lShowRoomId);
  	System.out.println("lCustomerId = "+lCustomerId);
  	System.out.println("--------------------------------------------");
  	return;
  }

}

class ManfacturingPlant{

	public static void main(String[] args) {
		System.out.println("main starts...");

        Laptop l1 = new Laptop
       ("macbook pro",101,150000,16,512,"5/21/2020","imagine123","cus1001");
       l1.displayLaptopDetails();

        System.out.println("main ends.......");
        return;
	}
}