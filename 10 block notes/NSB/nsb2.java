class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

         new Titan();

		System.out.println("main ends...");
		return;
	}
}
class Titan{

        static int i1;
               int i2;

	{
		System.out.println("non-static block executed");
		i1 = 10;// initializing the static variable from I.I.B
		System.out.println("static int i1 = "+i1);
		i2 = 20;// initializing the non static variable from I.I.B
		System.out.println("non-static i2 = "+i2);
		thor();// accessing static function from I.I.B
		drJones();// accessing non-static function from I.I.B
    }

	public static void thor(){
		System.out.println("static thor exe");
		return;
	}

	public void drJones(){
		System.out.println("non-static drJones exe");
		return;
	}
}