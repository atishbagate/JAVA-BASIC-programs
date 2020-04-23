// while loop 
/* 
while() -> declaration
{
	
	java codes...
}
	-> scope / body / defination.

*/

class A
{
	public static void main(String[] args)
	{     // statment declared on the basis of semi colon in program.
		
		int i; // declaring a iteration variable statment 1
		i = 1; // initializing a iteration statment 2
		while(i<=3) // boolean condition statment 3
		{
			System.out.println(i); // statment 4
			System.out.println( "hello"); //statment 5
			i+=1; // reintialization of iteration variable 
		} // iteration
	}
}