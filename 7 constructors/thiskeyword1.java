class A{

	public static void main(String[] args) {
		System.out.println("main starts...");

        Epson e1 = new Epson();
        System.out.println("e1 is poining towards Epson obj at loc = "+e1);

 /* ______________     
   |              |<-----e1
   | non - static |
   |   variables  |
   | non - static | 
   |   functions  | 
   |______________|  */ 

        Epson e2 = new Epson(); 
        System.out.println("e2 is poining towards Epson obj at loc = "+e2);

  /*______________     
   |              |<-----e2
   | non - static |
   |   variables  |
   | non - static | 
   |   functions  | 
   |______________|  */ 

   Epson e3 = new Epson(); 
   System.out.println("e2 is poining towards Epson obj at loc = "+e3);

 /*______________     
   |              |<-----e3
   | non - static |<-----this
   |   variables  |
   | non - static | 
   |   functions  | 
   |______________|  */ 


		System.out.println("main ends...");
		return;
	}
}
class Epson{

	public Epson(){
		System.out.println("this keyword is poining towards Epson obj at loc = "+this);
		return;
	}
}