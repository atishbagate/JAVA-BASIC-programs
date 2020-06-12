class VTU{

	/*
	  properties

      ExamStartDate
      ExamFee
      
      Behaviours

      GenerateHallTicket
      reciptNumber

	*/
 /*--------------------------- Generalization ----------------------------------------*/    
     double examFee       = 500;
     String examStartDate = "12/6/2020";

     public void generateHallTicket(boolean permission){
         
         if (permission == true) {
           	  System.out.println("Hallticket generated");
           	  System.out.println("Your exam starts on "+examStartDate);
           }else{
           	System.out.println("produce the fee recipt");
           	System.out.println("pay the examFee "+examFee);
           }  

     }  

      public void reciptNumber(String reciptNo){
        
         if (reciptNo.equals("321")) {
         	generateHallTicket(true);
         }else{
         	generateHallTicket(false);
         }
    }   
/*--------------------------- Generalization ----------------------------------------*/    
}
class Pesit extends VTU{
/*--------------------------- Specialization ----------------------------------------*/    

    public void festProgram(String festDate){
    	System.out.println("Fest scheduled on "+festDate);
    }
/*--------------------------- Specialization ----------------------------------------*/        
}
class Bms extends VTU{
/*--------------------------- Specialization ----------------------------------------*/    

    public void excerstion(String destination){
    	System.out.println("excerstion planned to "+destination);
    }
/*--------------------------- Specialization ----------------------------------------*/    
    
}

class Admisitration{

	public static void main(String[] args) {
		System.out.println("main starts..");

             Bms s1 = new Bms();
             s1.reciptNumber("121");

             Pesit s2 = new Pesit();
             s2.reciptNumber("321");

             s2.festProgram("12/2/2021");
             s1.excerstion("goa");

		System.out.println("main ends....");
		return;
	}
}