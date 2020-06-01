class A{
	public static void main(String[] args) {
		System.out.println("main starts...");

     System.out.println("non-static data member var = "+new B().var );
		/*
    ______________     
   |              |
   | int var      | 
   |   = 1000;    |
   | public void  | 
   | func(){ }    | 
   |______________|
		*/
   new B().func();
   	/*
    ______________     
   |              |
   | int var      | 
   |   = 1000;    |
   | public void  | 
   | func(){ }    | 
   |______________|
		*/

		System.out.println("main ends...");
		return;
	}
}
class B{
 
      int var = 1000;/*non-static data member*/

      public void func(){/*non-static function member*/
      	System.out.println("non-static func starts..");

      	System.out.println("non-static func ends..");
      	return;
      }

}