class Eco{

   public Eco(){ //here zero prametarized (argumental) constructor.

   	  System.out.println("Constructor of class Eco executed..");
   	  return;
   }
      
}
class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

        new Eco();
        new Eco();

		System.out.println("main ends....");
		return;
	}
}