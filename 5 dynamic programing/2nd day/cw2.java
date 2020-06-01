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

		String[][] iA = new String[size];

		System.out.println("input for array");

		for (int i = 0 ;i<iA.length ;i+=1 ) 
		{
			for (int j = 0;j<iA.length-1 ;j+=1 ) {
				System.out.println("Enter the ["+(i+1)+(j+1)+"] element");

			iA[i][j] = s.nextLine();
				
			}
		}


		 System.out.println("Retrieval os the array");
      for (int i = 0;i<iA.length ;i+=1 ) 
      {
      	for (int j = 0; j<iA.length-1 ;j+=1) {
      	System.out.print("Element present at position ["+(i+1)+(j+1)+"] is [ ");
      	System.out.println(iA[i][j]+" ] "); 
      }

	
		



		System.out.println("main ends");
	}

}


