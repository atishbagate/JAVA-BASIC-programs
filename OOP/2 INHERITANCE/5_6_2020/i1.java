class Father {
	
	String hairColor = "Red";
    
    public void walkingStyle(){
      
       System.out.println("Walks cross");
    }
}

class Daughter extends Father{
	
	String eyeColor = "blue";

	public void studyPattern(){
         
         System.out.println("Studies fast");
    }

}

class Driver{

	public static void main(String[] args) {
		System.out.println("main starts...");

         Father f = new Father();
         System.out.println("Father's hair color = "+f.hairColor);
         f.walkingStyle();
         //f.studyPattern(); not possible
 
         Daughter d = new Daughter();
         System.out.println("Daughter's eye color = "+d.eyeColor);
         d.studyPattern();

         System.out.println("inherited Daughter's hairColor = "+d.hairColor);
         d.walkingStyle();

		System.out.println("main ends...");
		return;
	}
}