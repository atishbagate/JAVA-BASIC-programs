class A
{
	public static void main(String[] args) {

		System.out.println("main s..");
		
		String s = "data";

		alpha(s);

		System.out.println("main e..");

		return;

	}

	public static String alpha(String s)
	{
		System.out.println("alpha s");

		System.out.println(s);
		

		System.out.println("alpha e");
		return s;
	}
}