class IPhone2{
	
	public void homeButton(String typeOfClick){
		System.out.println(this+" Clicked once taking back to home screan");
	}
}
class IPhone4 extends IPhone2{

    @Override
	public void homeButton(String typeOfClick){
        if (typeOfClick.equals("single click")) {
            System.out.println(this+" Clicked once taking back to home screan");
        }else if(typeOfClick.equals("double click")){
            System.out.println(this+" Clicked twice showing recent apps");
        }
	}
}
class Iphone5 extends IPhone4{

	public void homeButton(String typeOfClick){
      if (typeOfClick.equals("single click")) {
            System.out.println(this+" Clicked once taking back to home screan");
        }else if(typeOfClick.equals("double click")){
            System.out.println(this+" Clicked twice showing recent apps");
        }else if(typeOfClick.equals("long press")){
        	System.out.println(this+" long press unlocked the phone");
        }
	}
}
class Driver{

	public static void main(String[] args) {
		System.out.println("main starts...");

           new IPhone2().homeButton("single click");
           //new IPhone4().homeButton("single click");
           new Iphone5().homeButton("long press");

		System.out.println("main ends...");
		return;
	}
}