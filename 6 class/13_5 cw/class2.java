//1] static class members from static context
//All static members present in same class can be directly accessed from a static context.

class A{

    public static void f1(){
    	System.out.println("f1 exe");
    }

    static char c = 'c';
 



	public static void main(String[] args) {
		System.out.println("main  starts...");

         f1(); //here static function member is called from class A direclty 
         System.out.println(c); //here static data member called from the class A Directly

		System.out.println("main ends...");
		return;
	}
}