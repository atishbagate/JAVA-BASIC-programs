import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts");

		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value");

		if (s1.hasNextByte()) {
		byte b1 = s1.nextByte();
		System.out.println(b1);			
		}
		else{
			System.out.println("enter right value");
		}

		System.out.println("main ends");
	}
}