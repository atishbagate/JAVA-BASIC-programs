class A{
	
	public static void main(String[] args) {
		
		A aRef = 100;
        /* compile time error
        incompatible types: int cannot be converted to A
                A aRef = 100;*/
        aRef = 1000;
        /* compile time error
               cannot find symbol
                aRef = 1000;
        */  

	}
}