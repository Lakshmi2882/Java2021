package Abstract_oops;

public class loginpage extends page{
	public loginpage()
	{
		System.out.println("loginpage constructor");
	}
	@Override
	public void title() {
		// TODO Auto-generated method stub
		System.out.println("lp titile");
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		System.out.println("lp url");
	}

	@Override
	public void loading() {
		// TODO Auto-generated method stub
		System.out.println("lp loading");
	}
	public void doLogin(String username,String password)
	{
		System.out.println("login with"+username +password);
	}
	public void doLogin(String email)
	{
	System.out.println("login with email"+email);
	}
	@Override
public void header()
{
	System.out.println("login page header");
}
}