class Alpha{

	public static void main(String[] args) {
		System.out.println("main starts...");

		System.out.println("static data1 = "+Bravo.data1);
		Bravo b1 = new Bravo();
		System.out.println("non-static data2 = "+b1.data2);
		Bravo.albert();
		Bravo b2 = new Bravo();
		b2.isaac();

		System.out.println("main ends...");
		return;
	}
}

class Bravo{
   
    static int data1 = 1000;

           int data2 = 2000;

    public static void albert(){
    	System.out.println("static albert executed");
    return;
    }  

    public void isaac(){
    	System.out.println("non-static isaac executed");
    	return;
    }     
}
