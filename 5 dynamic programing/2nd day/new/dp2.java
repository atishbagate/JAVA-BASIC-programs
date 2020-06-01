import java.util.Scanner;
class A
{
   public static void main(String[] args) {
   	  System.out.println("main starts..");
   	     
      Scanner s = new Scanner(System.in);
     
     System.out.println("Enter the size of the array");

     int size = s.nextInt();  

      int[] iA = new int[size];
    System.out.println("Initialization of the array");
      for (int i = 0;i<iA.length ;i+=1 ) {
      	    System.out.println("Enter the ["+(i+1)+"] element");
        	iA[i] = s.nextInt();
        }  

    System.out.println("Retrieval os the array");
      for (int i = 0;i<iA.length ;i+=1 ) {
      	System.out.print("Element present at position ["+(i+1)+"] is [ ");
      	System.out.println(iA[i]+" ] "); 
      }
      
   	  System.out.println("main ends...");
      return;
   }
}