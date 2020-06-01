class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

      new Pentagon();//loading Pentagon.class file to jvm memory

		System.out.println("main ends...");
		return;
	}

}
class Pentagon{

	static int i1;
	       int i2;

   static{
		//static block
		System.out.println("static block executed....");
		i1 = 100;//initializing a static variable
		System.out.println("static i1 = "+i1);
		Pentagon pRef = new Pentagon();
		pRef.i2 = 200;//initializing a non-static variable
		System.out.println("non-static i2 = "+pRef.i2);

		alpha();//invoking a static function from a S.I.B
		pRef.bravo();//invoking a non-static function from a S.I.B
    }

    public static void alpha(){
    	System.out.println("static alpha exe");
    	return;
    }
    public void bravo(){
    	System.out.println("non-static bravo exe");
    	return;
    }
    

}