class Argon{/*uncontroled indirect recursion*/

	public static void main(String[] args) {
		System.out.println("main starts...");

		new Xenon().eon();

		System.out.println("main ends...");
		return;
	}
}
class Xenon{

	public void eon(){
		System.out.println("eon starts...");
          
        ion();

		System.out.println("eon ends...");
		return;
	} 
	public void ion(){
		System.out.println("ion starts....");
        
        eon();

		System.out.println("ion ends...");
		return;
	}
}
