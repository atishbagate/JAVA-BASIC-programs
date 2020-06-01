import java.util.Scanner;
class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

        Scanner s1 = new Scanner(System.in);
        System.out.println("Please provide an input character");
       
        String s = s1.nextLine();
       
        System.out.println(s);  


		System.out.println("main ends...");
	}
}