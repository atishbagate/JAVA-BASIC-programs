class A{
	public static void main(String[] args) {
		System.out.println("main starts...");
             
            new Eon(10);//1 

		System.out.println("main ends...");
		return;
	}
}
class Eon{

	public Eon(){//1st O.C
		this(10.10);
          System.out.println("Zero arguments constructor");
	  return;	
	}
	public Eon(int a){//2st O.C
		this(10,10.10);
		  System.out.println("int argument constructor");
		return;
	}
	public Eon(int a,int b){//3st O.C
		this();
		  System.out.println("int,int arguments constructor");
		return;
	}
	public Eon(int a, double b){//4st O.C
		this(10,10);
		  System.out.println("int,double arguments constructor");
		return;
	}
	public Eon(double b,int a){//5st O.C
		  System.out.println("double,int arguments constructor");
		return;
	}
}