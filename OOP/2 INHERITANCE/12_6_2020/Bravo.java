class Bravo{
	 
	 public int num(){
	 	return 10;
	 }

}
class Charlie extends Bravo{

}
class Driver{

	public static void main(String[] args) {
		System.out.println("main starts...");

           Charlie c = new Charlie();
           int n = c.num();
           System.out.println("number = "+ n);

		System.out.println("main ends..");
		return;
	}
}