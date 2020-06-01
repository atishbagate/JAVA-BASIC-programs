class Pet{
	
	String name = "Bruce";
	double height = 3.3;

	public void running(){
		System.out.println(name+" is running at speed of 10km/hr.");
	}
	public void growing(){
		System.out.println(name+" grew to "+height+" this month.");
	}
}
class Owner{

	public static void main(String[] args) {
		
        Pet retRef = new Pet();

		System.out.println("My pet name is "+retRef.name);
		System.out.println(retRef.name+" is "+retRef.height+" tall.");
		retRef.running();
		retRef.growing();

	}
}