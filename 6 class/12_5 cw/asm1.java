class A{

    static int var = 100;/*static data memmber*/

    public static void func(){/*static func member*/
       System.out.println("static func starts..");
       System.out.println("static func ends...");
       return;
    }



	public static void main(String[] args) {
		System.out.println("main starts...");

        System.out.println("static data member var = "+var); //here data member is accesed directly
        func(); //here data function is accesed directlyss

		System.out.println("main ends...");
		return;
	}
}