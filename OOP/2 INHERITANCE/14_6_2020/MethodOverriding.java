class Alpha{

	public void eco(){
		System.out.println("eco of alpha exe");
	return; 
	}
}
class Bravo extends Alpha{

    @Override
	public void eco(){
		System.out.println("eco of bravo class");
	return; 
	}
}

class Driver {

	public static void main(String[] args) {
		System.out.println("main starts...");

          new Bravo().eco();

		System.out.println("main ends...");
		return;
	}
}