class A{

	public void f1(){
    	System.out.println("f1 exe");
    }

     char c = 'c';
 

     public void func(){
     	System.out.println(c);
     	f1();
     }


	public static void main(String[] args) {
		System.out.println("main  starts...");

        new A().func();

		System.out.println("main ends...");
		return;
  }
}