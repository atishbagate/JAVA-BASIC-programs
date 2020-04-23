//prog to print the first even nos.
// while is used when we dont know the starting and ending number
// just we know the counter (count) of the program that is first 5.
class A
{
	public static void main(String[] args) 
	{
		int i = 1;
		int count = 1;
		while(count <= 5) 
		{
			if(i%2==0) // the given num is even
			{  System.out.println("count value...");
				System.out.println(count);
				System.out.println("even number....");
				System.out.println(i);
				count+=1;
				
			}
			i++;

		}
	}
}