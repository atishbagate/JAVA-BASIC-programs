class Alpha extends Object{
  // 11 non-static Object class properties
	public Alpha(){
        super();
    return;    
	}
  
    int i = 10;
    public void func(){
    	System.out.println("func of Alpha");
    }
}

class Bravo extends Object{
  // 11 non-static Object class properties
    public Bravo(){
        super();
    return;    
    }

    int i = 20;
    public void func(){
    	System.out.println("func of Bravo");
    }
}

class Charlie extends Alpha,Bravo{
    // Ambiguity to copy object class properties to carlie class since there are 2 paths to do so 
    public Charlie(){
    	super();//It creates confusion to which super class constructor to be invoked
    return;	
    }

    public void temp(){
    	System.out.println(i);// should it make a call for i of Alpha or i of Bravo.
    	func();// should it make a call for func() of Alpha or func() Bravo.
    }
}