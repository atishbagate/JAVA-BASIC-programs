class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

          Pentagon.i1 = 1;//Pentagon.class file will be loaded into jvm memory
                  //or
        //  new Pentagon().i2 = 0;//Pentagon.class file will be loaded into jvm memory

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
	}
}