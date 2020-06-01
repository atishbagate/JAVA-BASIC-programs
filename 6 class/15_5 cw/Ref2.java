class JointAccount{

   String accNo;
   double balance;

   public void createAccount(String aN){
   	  System.out.println("createAccount starts..");
      accNo = aN;
      System.out.println("Yours savings account is created with an accountnumber ["+accNo+"]");
      System.out.println("createAccount ends...");
   return;
   }

   public void deposit(int amt){
   	    System.out.println("deposit starts..");
        balance = balance + amt;
        System.out.println("Your account is deposited with ["+amt+".Rs]");  
        System.out.println("deposit ends...");
   return;
   }

   public void withdraw(int amt){
   	   	System.out.println("withdraw starts..");
   	    balance = balance - amt;
   	    System.out.println("Your account is withdrawed with ["+amt+".Rs]");
        System.out.println("withdraw ends...");
    return;
   }

   public void showBalance(){
   	   	System.out.println("showBalance starts..");
   	    System.out.println("your savings account ["+accNo+"] has a balance of ["+balance+".Rs]");
        System.out.println("showBalance ends...");
    return; 
   }
}

class User{

  public static void main(String[] args) {
    System.out.println("main starts..");
      
      //syntex -> className NameAssign = new className();

        JointAccount rahulGandhi = new JointAccount();
        System.out.println("rahulGandhi pointing to "+rahulGandhi);
        rahulGandhi.createAccount("rddp123");

        //connecting rahulgandhi account to dinchakpooja;
        //by assigning same address to Dinchakpooja account;
        //syntax-> className NameAssign = NameOfThatAssignNameToCopy;
        JointAccount dinchakPooja = rahulGandhi; 
        System.out.println("dinchakPooja pointing to "+dinchakPooja);
        rahulGandhi.deposit(1000000);
        rahulGandhi.showBalance();
        dinchakPooja.withdraw(1000000);
        rahulGandhi.showBalance();
       
  /*______________     
   |              |<---- rahulGandhi
   |accNo ="rg123"|<---- dinchakPooja 
   |balance = 0.0M|
   | cA,dep,with  | 
   |  and sB      | 
   |______________|*/

    System.out.println("main ends...");
    return;
  }
}