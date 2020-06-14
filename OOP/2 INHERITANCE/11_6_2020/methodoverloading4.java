class Circle{

       /*This function draws a circle using a double radius argument*/
       public static void drawCircle(double radius){
          System.out.println("drawing a circle with specified radius");
          return;
       }
       
       /*This function draws a circle using a float diameter argument*/
       public static void drawCircle(float diameter){
           System.out.println("drawing a circle with specified diameter");
           return;
       }
}
class Student{

	public static void main(String[] args) {
		System.out.println("main starts....");

             Circle.drawCircle(10.0);

        System.out.println("main ends...");
        return;
	}
}
