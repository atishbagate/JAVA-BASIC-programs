
//write a function to find 
//the sum of 2 bytes and print the result

import java.util.Scanner;
class a
{
	public static void main(String[] args) {
		System.out.println("main starts..");


		System.out.println("enter the proper value");
		Scanner s1 = new Scanner(System.in);


		if (s1.hasNextByte()) {
			byte b1 = s1.nextByte();
			System.out.print("1st value ");
	
			System.out.println(b1);

			Scanner s2 = new Scanner(System.in);

		if (s1.hasNextByte()) {
			byte b2 = s2.nextByte();
			System.out.println("2nd value ");
			System.out.println(b2);	

			System.out.println("sum is ");
			int c = add(b1,b2);
			System.out.println("addition is "+c);
		}


		}
		else {
			System.out.println("value is not proper");
		}

		System.out.println("main ends..");
	}

	public static int add(byte b1, byte b2)

	{
		System.out.println("1st value"+b1);
		System.out.println("2nd value"+b2);

		int c = b1+b2;
		return c;
	}
}