class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

         Sample sRef = new Sample();
         sRef.init(10,20);
         sRef.showData();

		System.out.println("main ends...");
		return;
	}
}
class Sample{

	int a;
	int b;

//initialization using functions
   public void init(int p1,int p2){ //parametarized constructor.
   	 System.out.println("initialization starts..");
   	 a = p1;
   	 b = p2;
   	 System.out.println("initialization ends...");
   	 return;
   }
   public void showData(){ //here zero prametarized (argumental) constructor.
   	System.out.println("showData starts...");
   	System.out.println("value in var a = "+a);
   	System.out.println("value in var b = "+b);
   	System.out.println("showData ends..");
   	return;
   }
 
}