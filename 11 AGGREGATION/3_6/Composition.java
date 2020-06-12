class Facebook{

	String uName;
	String pwd;
	boolean signInFlag;
	Instagram iA;

	public void linkInstagramAccount(Instagram iAfromUser){
		System.out.println("linkInstagramAccount");
        System.out.println("Linking insta account to facebook");
        iA = iAfromUser;
		System.out.println("linkInstagramAccount");
	}

	public void createFacebookAccount(String uName,String pwd){
		System.out.println("createFacebookAccount starts..");
            this.uName = uName;
            this.pwd   = pwd;
		System.out.println("createFacebookAccount ends..");
		return;
	}

	public void openInstagram(){
        System.out.println("openInstagram starts");
              if(iA != null ){
              	     if (iA.signInFlag==true) {
              		      System.out.println("opening Instagram from facebook");
              	     }else{
              		      System.out.println("SignIn to Instagram first");
              	     }    	
              }else{
              	System.out.println("Link instagram account to facebook first");
              }
        System.out.println("openInstagram starts");
        return;
	}

	public void facebookSignIn(String uNameHtml,String pwdGHtml){
         System.out.println("FacebookSignIn starts...");
            if (uName.equals(uNameHtml)) {
            	if (pwd.equals(pwdGHtml)) {
            		System.out.println("SignIn successful");
            		signInFlag = true;
            	}else{
            		System.out.println("Invalid password");
            	}
            }else{
               System.out.println("Invalid userName");
            }

         System.out.println("FacebookSignIn ends...");
         return;
	}
	public void facebookSignOut(){
		System.out.println("FacebookSignOut starts..");
		if (signInFlag == true) {
			System.out.println("SignOut successful");
			signInFlag = false;
		}else{
			System.out.println("First SignIn to SignOut");
		}
		System.out.println("FacebookSignOut ends..");
		return;
	}

	public void viewAccountStatus(){
		System.out.println("-------------------------------------");
		System.out.println("Current userName = "+uName);
		System.out.println("Current password = "+pwd);
		System.out.println("SignIn state = "+signInFlag);
		System.out.println("-------------------------------------");
		return;
	}

}

class Instagram{

	String uName;
	String pwd;
	boolean signInFlag;
	Facebook fA;

	public void linkFacebookAccount(Facebook fAfromUser){
		System.out.println("linkInstagramAccount");
        System.out.println("Linking facebook account to insta");
        fA = fAfromUser;
		System.out.println("linkInstagramAccount");
	}

	public void createInstagramAccount(String uName,String pwd){
		System.out.println("createInstagramAccount starts..");
            this.uName = uName;
            this.pwd   = pwd;
		System.out.println("createInstagramAccount ends..");
		return;
	}

	public void openFacebook(){
        System.out.println("openFacebook starts");
        if (fA!=null) {
        	 if (fA.signInFlag==true) {
           	        System.out.println("opening facebook from instagram");
             }else{
           	       System.out.println("SignIn to facebook first");
             }
        }else{
           System.out.println("Link facebook acc to instagram first");
        }  
        System.out.println("openFacebook starts");
        return;
        
	}

	public void instagramSignIn(String uNameHtml,String pwdGHtml){
         System.out.println("InstagramSignIn starts...");
            if (uName.equals(uNameHtml)) {
            	if (pwd.equals(pwdGHtml)) {
            		System.out.println("SignIn successful");
            		signInFlag = true;
            	}else{
            		System.out.println("Invalid password");
            	}
            }else{
               System.out.println("Invalid userName");
            }

         System.out.println("InstagramSignIn ends...");
         return;
	}
	public void instagramSignOut(){
		System.out.println("InstagramSignOut starts..");
		if (signInFlag == true) {
			System.out.println("SignOut successful");
			signInFlag = false;
		}else{
			System.out.println("First SignIn to SignOut");
		}
		System.out.println("InstagramSignOut ends..");
		return;
	}

	public void viewAccountStatus(){
		System.out.println("-------------------------------------");
		System.out.println("Current userName = "+uName);
		System.out.println("Current password = "+pwd);
		System.out.println("SignIn state = "+signInFlag);
		System.out.println("-------------------------------------");
		return;
	}

}

class User{

	public static void main(String[] args) {
		System.out.println("main starts...");
        
        // creating fb acc
        Facebook fb = new Facebook();
        fb.createFacebookAccount("Tony","Pepper");
        // signing in into fb
        fb.facebookSignIn("Tony","Pepper");
        fb.viewAccountStatus();
        //trying to open istagram from fb but insta acc not linked yet
        fb.openInstagram();

        //creating insta acc
        Instagram ins = new Instagram();
        ins.createInstagramAccount("Tony","Pepper");
        ins.instagramSignIn("Tony","Pepper");
        ins.viewAccountStatus();
        //linking inta acc to fb
        fb.linkInstagramAccount(ins);
        // trying to open insta from fb
        fb.openInstagram();
        
        // tring to open facebook from instagram without linking facebook acc  
        ins.openFacebook();  
        
        // linking facebook account to insatagram
        ins.linkFacebookAccount(fb);
        
        // tring to open fb from insta
        ins.openFacebook();  

		System.out.println("main ends...");
		return;
	}
}