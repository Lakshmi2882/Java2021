package Abstract_oops;

public abstract class page {
//1.class should have "abstract"
//2. abstract method should not have method body
	//3.abstract class can have non abstract methods
	//4. it can have static methods and static methods can not be overridden
	//5. can not create object of abstract class
	//parent class constructor will be called when you create object of child class
	//adv:Hiding the implemention of methods
	public page()
	{
	System.out.println("abstract class constructor");
	}
	public abstract void  title();
	public abstract void url();
	public abstract void loading();
	public void header()
	{
		System.out.println("page title");
	}
	public final static void logo()
	{
		System.out.println("page logo");
	}
	
}
