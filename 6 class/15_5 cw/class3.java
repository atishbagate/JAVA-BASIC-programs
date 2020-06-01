class A{

	public void f1(){
    	System.out.println("f1 exe");
    }

    char c = 'c';


	public static void main(String[] args) {
		System.out.println("main  starts...");

         A aRef = new A();
         aRef.f1();
         System.out.println(aRef.c);

		System.out.println("main ends...");
		return;
	}
}