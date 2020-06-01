//till then create an char array
// which takes dynamic size and 
//elements and print them in a diff func
import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts");

		Scanner s = new Scanner(System.in);

		System.out.println("provide the Character input to the array.");

		int size = s.nextInt();

		String[] iA = new String[size];

		System.out.println("input for array");

		for (int i = 0 ;i<iA.length ;i+=1 ) {
			System.out.println("Enter the ["+(i+1)+"] element");
			iA[i] = s.nextLine();
			
		}

		print(iA);
		



		System.out.println("main ends");
	}

	public static void print(String[] iA)
	{
		 System.out.println("Retrieval os the array");
      for (int i = 0;i<iA.length ;i+=1 ) {
      	System.out.print("Element present at position ["+(i+1)+"] is [ ");
      	System.out.println(iA[i]+" ] "); 
      }
      return;

	}
}


