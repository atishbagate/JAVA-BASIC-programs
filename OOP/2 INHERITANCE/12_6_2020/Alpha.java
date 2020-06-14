class Alpha{


}
class Driver{

	public static void main(String[] args) {
		System.out.println("main starts..");

        Alpha a = new Alpha();
        int hashCode = a.hashCode();//Object class's function
        System.out.println("hashCode = "+hashCode);
        System.out.println("hashcode = "+ new Driver().hashCode());

		System.out.println("main ends..");
		return;
	}
}