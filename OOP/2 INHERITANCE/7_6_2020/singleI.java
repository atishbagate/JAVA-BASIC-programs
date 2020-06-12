class Senior{
	
	int cN = 101;

	public void classPattern(){
		System.out.println("Viewing the classPattern of "+this);
		System.out.println("100 working days");
		System.out.println("30 days of vacations");
		System.out.println("10 days internals");
		System.out.println("40 days for externals");
	}
}

class Junior extends Senior{
 
   String newSubject = "BTD";

   public void sportsPass(boolean permission){
   	     if (permission == true) {
   	     	System.out.println(this+" Sports pass granted");
   	     }else{
   	     	System.out.println(this+" sportsPass rejected");
   	     }
   }
}

class Department{

	public static void main(String[] args) {
		System.out.println("main starts..");

         Senior kumarswamey = new Senior();
         kumarswamey.classPattern();
         System.out.println("kumarswamey's class room = "+kumarswamey.cN);

         Junior nikil = new Junior();
         nikil.sportsPass(true);
         System.out.println("nikil's new subject = "+nikil.newSubject);

         nikil.classPattern();
         System.out.println("nikil's classroom = "+nikil.cN);


		System.out.println("main ends...");
		return;
	}
}