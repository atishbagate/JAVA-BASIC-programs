// non-static class members from static context
// All non-static members present in same class can be accessed by creating the object for the class.

class A{

	public void f1(){
    	System.out.println("f1 exe");
    }

    char c = 'c';


	public static void main(String[] args) {
		System.out.println("main  starts...");

         A aRef = new A(); //here object is created sintex-> DataType RefVariable = new classname();
         aRef.f1(); // accesing a function from other class with refVariable.
         System.out.println(aRef.c); //accesing a data member variable from other class with refVariable.

		System.out.println("main ends...");
		return;
	}
}