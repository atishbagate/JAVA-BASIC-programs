// firstly do block is executed then value is incremented
// statment is printed when condition is false.
// statment in do block executed at least once.

//when condition have to excute once either it is true or false.+++> then this do while loop is used.

class A
{
	public static void main(String[] args) 
	{
	
	System.out.println("--- do-while loop---");	
	int k = 1;
	
	do // first block is executed 
	{
		System.out.println("stupid");

			k+=1;

	} //then condition is checked
	while(k<=4);


	}
}