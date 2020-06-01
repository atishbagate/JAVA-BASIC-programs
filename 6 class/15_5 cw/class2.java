class A{

    public static void f1(){
    	System.out.println("f1 exe");
    }

    static char c = 'c';
 



	public static void main(String[] args) {
		System.out.println("main  starts...");

         f1();
         System.out.println(c);

		System.out.println("main ends...");
		return;
	}
}