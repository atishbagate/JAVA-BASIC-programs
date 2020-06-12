class Alibaba{

	int cartItems;
    int[] itemIds = new int[3];
    /*    
       | 101 | 102 | 103 |
          0     1     2 
    */  
    int startIndex = 0;      
    int endIndex   = itemIds.length-1;
    int tracker    = startIndex;
	
	public void addToCart(int itemId){
         
       if (tracker<=endIndex) {
         	itemIds[tracker]  = itemId;
         	System.out.println("tracker = "+tracker);
         	tracker+=1;
         }else{
         	System.out.println("cart is full");
         }  
             
	}
	public void showItems(){

		for (int i = 0;i <= tracker-1;i += 1 ) {
			System.out.println("Item present in index = "+ itemIds[i]);
		}
	}
	public void makePayment(DebitCard dcd){
        if (dcd.cvv != 0) {
        	System.out.println("Total amount to be paid using DebitCard  = "+(tracker*1000));
        }else{
            System.out.println("invalid cvv code ");
        }
	}
	public void makePayment(CreditCard ccd){
        if (ccd.cvv != 0) {
        	System.out.println("Total amount to be paid using CreditCard = "+(tracker*1000));
        }else{
            System.out.println("invalid cvv code ");
        }
	}
}
class DebitCard{

   int cardNo;
   String expD;
   int cvv;

	public DebitCard(int cardNo,String expD,int cvv){
		this.cardNo = cardNo;
		this.expD = expD;
		this.cvv = cvv;
       System.out.println("card details provided");
	}
}

class CreditCard{

   int cardNo;
   String expD;
   int cvv;

	public CreditCard(int cardNo,String expD,int cvv){
		this.cardNo = cardNo;
		this.expD = expD;
		this.cvv = cvv;
       System.out.println("card details provided");
	}
}
class User{

	public static void main(String[] args) {
		System.out.println("main starts...");

          Alibaba user1 = new Alibaba();
          user1.addToCart(101);
          user1.addToCart(102);
          user1.addToCart(103);
        
          user1.showItems();
          
          DebitCard ud1 = new DebitCard(10101,"12/12",121);
          user1.makePayment(ud1);

          CreditCard uc1 = new CreditCard(20202,"13/13",131);
          user1.makePayment(uc1);

		System.out.println("main ends...");
		return;
	}
}