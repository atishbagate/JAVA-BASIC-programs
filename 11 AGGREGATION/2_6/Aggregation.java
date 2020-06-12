class GoogleAccount{

	String uName;
	String pwd;
	boolean signInFlag;

	public void createGoogleAccount(String uName,String pwd)
	{
		System.out.println("createGoogleAccount starts..");
            this.uName = uName;
            this.pwd   = pwd;
		System.out.println("createGoogleAccount ends..");
		return;
	}

	public void googleSignIn(String uNameHtml,String pwdGHtml)
	{
         System.out.println("GoogleSignIn starts...");
            if (uName.equals(uNameHtml)) 
            {
            	if (pwd.equals(pwdGHtml)) 
            	{
            		System.out.println("SignIn successful");
            		signInFlag = true;
            	}
            	else
            	{
            		System.out.println("Invalid password");
            	}
            }
            else
            {
               System.out.println("Invalid userName");
            }

         System.out.println("GoogleSignIn ends...");
         return;
	}
	public void googleSignOut()
	{
		System.out.println("googleSignOut starts..");
		if (signInFlag == true) 
		{
			System.out.println("SignOut successful");
			signInFlag = false;
		}else{
			System.out.println("First SignIn to SignOut");
		}
		System.out.println("googleSignOut ends..");
		return;
	}

	public void viewAccountStatus()
	{
		System.out.println("-------------------------------------");
		System.out.println("Current userName = "+uName);
		System.out.println("Current password = "+pwd);
		System.out.println("SignIn state = "+signInFlag);
		System.out.println("-------------------------------------");
		return;
	}

}

class PlayStore{


	GoogleAccount gA ;

	public void linkGoogleAccount(GoogleAccount gAfromUser)
	{
		System.out.println("linkGoogleAccount starts....");
		System.out.println("Linking GoogleAccount with PlayStore");
		gA = gAfromUser;
		System.out.println("linkGoogleAccount ends..");
		return;
	}


	public boolean authoriseUser()
	{
		System.out.println("authoriseUser starts...");
		   if (gA.signInFlag == true) 
		   {
		   	System.out.println("authoriseUser ends...");
		   	return true;
		   }
		   else
		   {
		   	System.out.println("The user is not signed in to Google Account");
		   	System.out.println("authoriseUser ends...");
		   	return false;
		   }
	}

	public void installApp(String appName)
	{
        System.out.println("installApp starts...");
            boolean userAuthorisation = authoriseUser();
            if (userAuthorisation == true) 
            {
            	System.out.println(appName+" successfully installing");
            }
            else
            {
            	System.out.println(appName+" unable to install");
            }
        System.out.println("installApp ends...");
        return;
	}
}

class User{

	public static void main(String[] args) 
	{
		System.out.println("main starts...");

          GoogleAccount ga1 = new GoogleAccount();
          ga1.createGoogleAccount("ElonMusk","falcon8 heavy");
          ga1.viewAccountStatus();
          ga1.googleSignIn("ElonMusk","falcon8 heavy");
          ga1.viewAccountStatus();
         // ga1.googleSignOut();
          //ga1.viewAccountStatus();

          PlayStore ps1 = new PlayStore();
          ps1.linkGoogleAccount(ga1);
          ps1.installApp("TikTok");

		System.out.println("main ends...");
		return;
	}
}