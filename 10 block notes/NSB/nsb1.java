class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

         new Titan();
         new Titan();

		System.out.println("main ends...");
		return;
	}
}
class Titan{

         int i = 100;
	{
		System.out.println("non-static block executed");
	}
}