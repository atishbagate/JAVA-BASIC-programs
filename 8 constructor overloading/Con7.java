class A{
	
	public static void main(String[] args) {
		System.out.println("main starts...");

        new B(10,20);//1st O.C
        new B(10,20.20);//2nd O.C
        new B(10,20,30);//3rd O.C

		System.out.println("main ends...");
		return;
	}
}

class B{

	public B(int a,int b){//1st
		System.out.println("int ,int contructor");
	}
	public B(int a ,double b){//2nd
        System.out.println("int , double constructor");
	}
	/*public B(int b,double a){//not overloaded but duplicate
		System.out.println("int, double constructor");
	}*/

	public B(int a,int b,int c){//3rd
		System.out.println("int, int, int constructor");
	}
}