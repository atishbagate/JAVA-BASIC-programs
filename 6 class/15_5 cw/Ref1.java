class SavingAccount{

   String accNo;
   double balance;

   public void createAccount(String aN){
   	  System.out.println("createAccount starts..");
      accNo = aN; //assign account number.
      System.out.println("Yours savings account is created with an accountnumber ["+accNo+"]");
      System.out.println("createAccount ends...");
   return;
   }

   public void deposit(int amt){ //enter amount to deposite
   	    System.out.println("deposit starts..");
        balance = balance + amt; //depiste function
        System.out.println("Your account is deposited with ["+amt+".Rs]");  
        System.out.println("deposit ends...");
   return;
   }

   public void withdraw(int amt){ //enter amount to withdrow
   	   	System.out.println("withdraw starts..");
   	    balance = balance - amt; //wihdrow function
   	    System.out.println("Your account is withdrawed with ["+amt+".Rs]");
        System.out.println("withdraw ends...");
    return;
   }

   public void showBalance(){
   	   	System.out.println("showBalance starts..");
   	    System.out.println("your savings account ["+accNo+"] has a balance of ["+balance+".Rs]"); //balance showing funtion
        System.out.println("showBalance ends...");
    return; 
   }
}

class User{

	public static void main(String[] args) {
		System.out.println("main starts..");
    
        SavingAccount rahulGandhi = new SavingAccount(); //created a memory for new account.
        rahulGandhi.createAccount("rg123"); //enter account number to new account and name.
        System.out.println("rahulGandhi pointing to "+rahulGandhi); //address for account.
        SavingAccount dinchakPooja = new SavingAccount(); //another memory created for new person account.
        dinchakPooja.createAccount("dp123"); //enter account number to new account and name.
        System.out.println("dinchakPooja pointing to "+dinchakPooja); //address for account.
        rahulGandhi.deposit(1000000); 
        rahulGandhi.showBalance();
        dinchakPooja.deposit(10000);
        dinchakPooja.showBalance();
        rahulGandhi.withdraw(10000);
        rahulGandhi.showBalance(); 
        dinchakPooja.withdraw(1000);
        dinchakPooja.showBalance();

  /*______________     
   |              |<---- rahulGandhi
   |accNo ="rg123"| 
   |balance = 9.0L|
   | cA,dep,with  | 
   |  and sB      | 
   |______________|*/

      

  /*______________     
   |              |<---- dinchakPooja
   |accNo ="dp123"| 
   |balance = 9.0k|
   | cA,dep,with  | 
   |  and sB      | 
   |______________|*/




		System.out.println("main ends...");
		return;
	}
}