class House{
   
   /*
     Father    -> microsoft
     Mother    -> apple
     son       -> google
     daughter  -> yahoo
   */

   static boolean livingRoom ;
   boolean bedroom ;
   static boolean tv  ;
   static boolean kitchen ;
   boolean bed ;

   public void showHouseStatus(){
   	  System.out.println("         showHouseStatus starts....");
      System.out.println("         Living room occupied ? "+livingRoom );  
      System.out.println("         bedroom room occupied ? "+bedroom );  
      System.out.println("         tv occupied ? "+tv );  
      System.out.println("         kitchen occupied ? "+kitchen );  
      System.out.println("         bed occupied ? "+bed );  
   	  System.out.println("         showHouseStatus ends...");
   	  return;
   }
   
   public static void setLivingRoomStatus(boolean underUse){
   	System.out.println("setLivingRoomStatus starts...");
   	livingRoom = underUse;
   	System.out.println("setLivingRoomStatus ends...");
   	return;
   }

   public static void settvStatus(boolean underUse){
   	System.out.println("settvStatus starts...");
   	tv = underUse;
   	System.out.println("settvStatus ends...");
   	return;
   }

   public static void setkitchenStatus(boolean underUse){
   	System.out.println("setkitchenStatus starts...");
   	kitchen = underUse;
   	System.out.println("setkitchenStatus ends...");
   	return;
   }

    public void setbedroomStatus(boolean underUse){
   	System.out.println("setbedroomStatus starts...");
   	bedroom = underUse;
   	System.out.println("setbedroomStatus ends...");
   	return;
   }

   public void setbedStatus(boolean underUse){
   	System.out.println("setbedStatus starts...");
   	bed = underUse;8
   	System.out.println("setbedStatus ends...");
   	return;
   }



}
class FamilyMember{
    
   public static void main(String[] args) {
   	System.out.println("main starts....");

   	House microsoft = new House();
   	House apple = new House();
   	House google = new House();
   	House yahoo = new House();

   	microsoft.setbedroomStatus(true);
   	House.setLivingRoomStatus(true);
   	microsoft.showHouseStatus();


   	google.setbedroomStatus(false);
   	google.setbedStatus(true);
   	House.setLivingRoomStatus(false);
   	google.showHouseStatus();


   	System.out.println("main ends...");
   	return;
   }
}