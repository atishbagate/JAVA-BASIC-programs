//2d array
import java.util.Scanner;
class A
{
   public static void main(String[] args) {
   	  System.out.println("main starts..");
   	     
      Scanner s = new Scanner(System.in);
     
     System.out.println("Enter the number rows of the array");

     int rows = s.nextInt();  

     System.out.println("Enter the columns rows of the array");

      int columns = s.nextInt();  
      int[][] iA = new int[rows][columns];

    System.out.println("Initialization of the 2d array");

    for(int row = 0;row<iA.length;row+=1){
      for (int col = 0;col<iA[row].length ;col+=1 ) {
      	System.out.println("Enter the [ "+(row+1)+" ],[ "+(col+1)+" ] element");
        	iA[row][col] = s.nextInt();
    }
  }
    System.out.println("Retrieval of the elements of 2d array");

   for(int row = 0;row<iA.length;row+=1){
      for (int col = 0;col<iA[row].length ;col+=1 ) {
        System.out.print("Element present at position [ "+(row+1)+" ],[ "+(col+1)+" ] is [ ");
          System.out.println(iA[row][col]+" ] ");
    }
  }
      
   	  System.out.println("main ends...");
      return;
   }
}