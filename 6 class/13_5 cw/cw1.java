/*creat a class which will contain a type ,name,breed,age,height of a pet and 
the function like feeding,bathing, and walking.
creat another owner class with main function to access all there data and perform these function.

1) in pet class all the data and function member should be static.
in pet class all data and function members should be non static.
*/


class pet
{
	static String type = "pet dog";
	 static String name = "rocky";
	static String breed = "german sheford";
	static int age = 12;
	static int height = 123;


	public static void feeding()
	{
		System.out.println("feeded to pet");
		return;
	}
	public static void bathing()
	{
		System.out.println("bath to pet");
		return;
	}
	public static void walking()
	{
		System.out.println("walked to pet");
		return;
	}

}

class owner
{
	public static void main(String[] args) 
	{
		

		System.out.println("owner starts");

		
		System.out.println("main starts");

		pet pet

		System.out.println("main ends");
		



		System.out.println("owner ends");
		
	}

	
}
