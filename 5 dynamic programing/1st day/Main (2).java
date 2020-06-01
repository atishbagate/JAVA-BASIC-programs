// write the function to find the sum of 2 bytes ad print the result.
import java.util.scanner;
class a
{
	public static void main(String[] args) {
		
		System.out.println("main starts..");

		System.out.println("enter the values for sum");

		scanner s1 = new scanner(System.in);
		number1 = s1.nextByte();

		scanner s2 = new scanner(System.in);
		number2 = s2.nextByte();

		int add = number1+number2;
		System.out.println( "addition is "+add);

		System.out.println("main ends..");
	}
}
