//4] non-static class members from non-static context
//-> All non-static members present in same class can be directly accessed from a non-static context.


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

        new A().func(); //here non-static context can be directly access.

		System.out.println("main ends...");
		return;
  }
}