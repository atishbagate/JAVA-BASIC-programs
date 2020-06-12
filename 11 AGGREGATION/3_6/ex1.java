class Facebook
{
	String uName;
	String pwd;
	boolean signInFlag;
	Instagram iA;

	public void linkInstagramAccount(Instagram iAfromUser)
	{
		System.out.println("linkInstagramAccount");
		System.out.println("linking instagram account to Facebook");
		iA = iAfromUser;

		System.out.println("linkInstagramAccount");
	}
	public void createFacebookAccount(String uName, String pwd)
	{
		System.out.println("createFacebookAccount starts..");
		this.uName = uName;
		this.pwd = pwd;
		System.out.println("createFacebookAccount ends..");
		return;
	}
	public void openInstagram()
	{
		System.out.println("openInstagram starts");
		if (iA != null) 
		{
			if (iA.signInFlag == true) 
			{
				System.out.println("open Instagram from Facebook");	
			}
			else
			{
				System.out.println("sign in into instagram first");
			}

		}
		else 
		{
			System.out.println("link Instagram account to Facebook first");	
		}
		System.out.println("open Instagram starts");
		return;
	}

	public void FacebookSignIn(String uNameHtml, String pwdGHtml)
	{
		System.out.println("Facebook sign in starts..");

		if (uName.equals(uNameHtml)) 
		{
			if (pwd.equals(pwdGHtml)) 
				{
					System.out.println("sighn in succesfull");	
					signInFlag = true;
				}
			else
			{
				System.out.println("invalid password");
			}
		}
				else
				{ 
					System.out.println("invalid username");
				}
	
	System.out.println("Facebook sign in ends");
	return;
	}

	public void FacebookSignOut()
	{
		System.out.println("FacebookSignOut starts");
		if (signInFlag == true) 
		{
			System.out.println("sigh out succesfull");
			signInFlag = false;
		}
		else 
		{
		System.out.println("first sighin to  signout ");
		}
		System.out.println("FacebookSignOut ends");
		return;
	}

	public void viewAccountStatus()
	{
		System.out.println("-----------------------");

		System.out.println("current username = "+uName);
		System.out.println("current password = "+pwd);
		System.out.println("signIn state = "+signInFlag);

		System.out.println("-----------------------");
		return;
	}
}

class Instagram
{
	String uName;
	String pwd;
	boolean signInFlag;
	Facebook fA;

	public void linkFacebookAccount(Facebook fAfromUser)
	{
		System.out.println("linkFacebookAccount");
		fA = fAfromUser;
		System.out.println("linkFacebookAccount");
	}
	public void createInstagramAccount(String uName , String pwd)
	{
		System.out.println("createInstagramAccount starts");

		this.uName = uName;
		this.pwd = pwd;

		System.out.println("createInstagramAccount ends");
		return;
	}

	public void openFacebook()
	{
		System.out.println("open facebook starts");

		if (fA != null) 
		{
			if (fA.signInFlag == true) 
			{
				System.out.println("open facebook from instagram");		
			}	
			else 
			{
				System.out.println("sighin to Facebook first");	
			}
		}
		else 
		{
			System.out.println("link Facebook account to instagram  first");		
		}
		System.out.println("open facebook ends");
	}

	public  void instagramSignIn(String uNameHtml, String pwdGHtml)
	{
		System.out.println("instagramSignIn starts..");

		if (uName.equals(uNameHtml)) 
		{
			if (pwd.equals(pwdGHtml)) 
			{
				System.out.println("sighin succesfull");
				signInFlag = true;		
			}	
			else
			{
				System.out.println("invalid password");
			}
		}
		else
		{
			System.out.println("invalid username");
		}
		System.out.println("instagramSignIn ends");
		return;
		}
    

			public void viewAccountStatus()
			{
				System.out.println("-------------------");

				System.out.println("current username = "+uName);
				System.out.println("current password = "+pwd);
				System.out.println("sighin state = "+signInFlag);
				System.out.println("--------------------");
				return;
			}

}

class User
{
	public static void main(String[] args) {
		System.out.println("main starts...");

		Facebook fb = new Facebook();
		fb.createFacebookAccount("tony","paper");

		fb.FacebookSignIn("tony","paper");

		fb.openInstagram();

		Instagram ins = new Instagram();

		ins.createInstagramAccount("tony","paper");

		ins.instagramSignIn("tony","paper");

		fb.linkInstagramAccount(ins);

		fb.openInstagram();

		ins.openFacebook();

		ins.linkFacebookAccount(fb);


		ins.openFacebook();


		System.out.println("main ends");
	return;
	}
}