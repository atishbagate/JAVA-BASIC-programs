//3] static class members from non-static context
//All static members present in same class can be directly accessed from a non-static context.

class A{

	public static void f1(){
    	System.out.println("f1 exe");
    }

    static char c = 'c';
 

     public void func(){ //this is non static context(function) can be directly called 
     	System.out.println(c);
     	f1();
     }


	public static void main(String[] args) {
		System.out.println("main  starts...");

        new A().func();//this is syntax to call non static member direclty. NOTE - class name is mentioned.

		System.out.println("main ends...");
		return;
	}

}