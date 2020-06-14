class Alibaba{

	int cartItems;
    int[] itemIds = new int[4];
    /*    
       | 101 | 102 | 103 | 104 |
          0     1     2     3
    */               
    int startIndex = 0;      
    int endIndex   = itemIds.length-1;
    int tracker    = startIndex;  
    boolean paymentFlag;

	/*
	    b = before func call for addToCart
	    a = after func call for addToCart
	    t = tracker value
        1st call b-> t = 0 a-> t = 1;
        2nd call b-> t = 1 a-> t = 2;
        3rd call b-> t = 2 a-> t = 3;
        4th call b-> t = 3 a-> t = 4;
        5th call b-> t = 4 a-> t = 5;
	*/

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

		for (int i = 0;i <= tracker-1;i += 1) {
			System.out.println("Item present in index = "+ itemIds[i]);
		}
	}
	public void makePayment(DebitCard dcd){
        if (dcd.cvv != 0) {
        	if(paymentFlag == false){ 
        	      System.out.println("Total amount to be paid using DebitCard  = "+(tracker*1000));
                  paymentFlag = true;
              }else{
              	System.out.println("Payment is already done");
              }
        }else{
            System.out.println("invalid cvv code ");
        }
	}
	public void makePayment(CreditCard ccd){
		if(ccd.cvv != 0){ 
               if(paymentFlag == false){ 
        	      System.out.println("Total amount to be paid using CreditCard  = "+(tracker*1000));
                  paymentFlag = true;
              }else{
              	System.out.println("Payment is already done");
              }
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
          user1.addToCart(104);
          user1.addToCart(105);
          user1.showItems();

          CreditCard uc1 = new CreditCard(20202,"13/13",131);
          user1.makePayment(uc1);
          
          DebitCard ud1 = new DebitCard(10101,"12/12",121);
          user1.makePayment(ud1);

          

		System.out.println("main ends...");
		return;
	}
}