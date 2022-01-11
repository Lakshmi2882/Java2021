package Abstract_oops;

public class Testpage {

	public static void main(String[] args) {
		loginpage lp=new loginpage();
		lp.header();
		lp.doLogin("sbharadwaj06@gmail.com","20November*");
		lp.logo();//static method
		//top casting:
		// child class object can be referred by parent class reference variable
		//you can access only parent class methods which are overridden by child class
	page p=	new loginpage();
	p.header();
	p.loading();
	p.title();
	p.url();
	//down casting:
//loginpage p1=	(loginpage) new page();
	//can not do down casting

	}

}
