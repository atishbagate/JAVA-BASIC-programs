class CircleByRad{

       /*This function draws a circle using a double radius argument*/
       public void drawCircle(double radius){
          System.out.println("drawing a circle with specified radius");
          return;
       }   
}
class CircleByDia extends CircleByRad{
   
       /*This function draws a circle using a float diameter argument*/
       public void drawCircle(float diameter){
           System.out.println("drawing a circle with specified diameter");
           return;
       }
}
class Student{

  public static void main(String[] args) {
    System.out.println("main starts....");

             new CircleByDia().drawCircle(10.0);

        System.out.println("main ends...");
        return;
  }
}
