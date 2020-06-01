class Pet{

	static String breed = "Bull God";
	static String name  = "Tony";

	public static void walking(){
		System.out.println(name+" going for long a walk");
	}
	public static void feeding(){
		System.out.println(name+" is eating chiken!");
	}
}
class Owner{

	public static void main(String[] args) {
		
		System.out.println("Name of my pet is "+Pet.name);
		System.out.println("My "+Pet.name+" is a "+Pet.breed);
		Pet.walking();
        Pet.feeding(); 
	}
}