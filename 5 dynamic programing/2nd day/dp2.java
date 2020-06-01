nimport java.util.Scanner;
class A
{
   public static void main(String[] args) {
   	  System.out.println("main starts..");
   	     
      Scanner s = new Scanner(System.in);
       
      System.out.println("Provide the imntger inputs to the array"); 
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();

      int[] iA = new int[3];
      iA[0] = a;
      iA[1] = b;
      iA[2] = c;  

      System.out.println(iA[0]); 
      System.out.println(iA[1]); 
      System.out.println(iA[2]); 


   	  System.out.println("main ends...");
      return;
   }
}