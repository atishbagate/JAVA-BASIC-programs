class Student{
	
	String sName;
	double sSub1;
	double sSub2;
	double sSub3;
	double sAvg;
	double sPercentage;

	public Student(String sName,double sSub1,double sSub2,double sSub3){
        
        this.sName = sName;
        this.sSub1 = sSub1;
        this.sSub2 = sSub2;
        this.sSub3 = sSub3;
        sAvg = (this.sSub1+this.sSub2+this.sSub3)/3;
        sPercentage = (this.sSub1+this.sSub2+this.sSub3/300)*100;
	return; 
	}

	public void displayStudentDetails(){
		System.out.println("---------------- Student details ----------");
	           System.out.println("sName = "+sName);
	           System.out.println("sSub1 = "+sSub1+" for 100 marks");
	           System.out.println("sSub2 = "+sSub2+" for 100 marks");
	           System.out.println("sSub3 = "+sSub3+" for 100 marks");
	           System.out.println("sAvg = "+sAvg+" for 300 marks");
	           System.out.println("sPercentage = "+sPercentage+" % ");
        System.out.println("--------------------------------------------");
        return;
	} 

}
class classTrainer{
	public static void main(String[] args) {
		System.out.println("main stars...");

         Student s1 = new Student("Hippy",35,35,34);
         s1.displayStudentDetails();

		System.out.println("main ends....");
		return;
	}
}