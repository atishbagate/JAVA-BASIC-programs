class A{
	
	public static void main(String[] args) {
		System.out.println("main starts...");

       
       B bRef = null;/*Reference variable of type B*/
       System.out.println("value of bRef before object creation = "+bRef);
       bRef = new B();/*Object for class B*/
       System.out.println("value of bRef after object creation = "+bRef);

		/*Heep Area
    ______________     
   |              |-B------->add->bRef
   | int var      | 
   |   = 1000;    |
   | public void  | 
   | func(){ }    | 
   |______________|
		*/
   System.out.println("non-static data member var = "+bRef.var);
   bRef.func();


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