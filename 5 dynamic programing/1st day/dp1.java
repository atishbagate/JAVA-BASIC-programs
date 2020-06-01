import java.util.Scanner;
class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

        Scanner s1 = new Scanner(System.in);
        System.out.println("Please provide an input integer value between -127 to +128");
       
        if (s1.hasNextByte()) {
         byte b1 = s1.nextByte();
         System.out.println(b1);	
        }else{
        	System.out.println("Next time provide a proper value");
        }
       
//write a function to find the sum of 2 bytes and print the result
		System.out.println("main ends...");
	}
}