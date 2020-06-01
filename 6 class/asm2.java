class A{

	public static void main(String[] args) {
		System.out.println("main starts....");

		System.out.println("static data member var = "+B.var);
		B.func();
		System.out.println("main ends..");
		return;
	}
}
class B{

	static int var = 100;/*static data memmber*/

    public static void func(){/*static func member*/
       System.out.println("static func starts..");
       System.out.println("static func ends...");
       return;
    }
}